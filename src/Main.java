import org.junit.platform.engine.support.descriptor.MethodSource;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import java.time.Duration;
import java.time.Instant;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;
/**
 * An automated JUnit 5 test runner for the ITCS 311L course project.
 * This class uses the JUnit Platform Launcher API to programmatically discover,
 * execute, and report on all test classes found within the {@code test.java} package.
 * It provides a detailed, formatted summary of the test results to the console.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n=======================================================");
        System.out.println("   ITCS 311L - Automated JUnit Test Runner");
        System.out.println("=======================================================\n");

        // Listener to generate the final summary report
        SummaryGeneratingListener summaryListener = new SummaryGeneratingListener();

        // Custom listener to collect all test identifiers
        TestIdentifierCollector collectorListener = new TestIdentifierCollector();

        // 1. Create a launcher and register both listeners
        Launcher launcher = LauncherFactory.create();
        launcher.registerTestExecutionListeners(summaryListener);
        launcher.registerTestExecutionListeners(collectorListener);


        // 2. Discover tests based on the 'test.class' system property
        System.out.println("Discovering tests...");

        // Read the property we set in Ant's build.xml
        String singleTestClass = System.getProperty("test.class");

        LauncherDiscoveryRequestBuilder builder = LauncherDiscoveryRequestBuilder.request();

        if (singleTestClass != null && !singleTestClass.isEmpty()) {
            // If the property is set, run ONLY that single test class
            System.out.println("Running single test: test.java." + singleTestClass + "\n");
            builder.selectors(
                    selectClass("test.java." + singleTestClass)
            );
        } else {
            // If no property is set, run all tests in the package (default behavior)
            System.out.println("Running all tests in package: test.java\n");
            builder.selectors(
                    selectPackage("test.java")
            );
        }

        LauncherDiscoveryRequest request = builder.build();

        System.out.println("Running tests...\n");

        // 3. Execute the tests and measure duration
        Instant startTime = Instant.now();
        launcher.execute(request);
        Instant endTime = Instant.now();
        long duration = Duration.between(startTime, endTime).toMillis();

        // 4. Print the detailed results
        printDetailedSummary(summaryListener.getSummary(), collectorListener.getTestIdentifiers(), duration);
    }

    // Helper to get a simple class name from a fully qualified name
    private static String getSimpleClassName(String fqcn) {
        if (fqcn == null || fqcn.isEmpty()) return "UnknownClass";
        int lastDot = fqcn.lastIndexOf('.');
        return (lastDot > 0) ? fqcn.substring(lastDot + 1) : fqcn;
    }

    private static void printDetailedSummary(TestExecutionSummary summary, Collection<TestIdentifier> allTests, long duration) {
        System.out.println("=======================================================");
        System.out.println("                     Test Results                      ");
        System.out.println("=======================================================");

        String totalTime = String.format("%.3f s", duration / 1000.0);
        System.out.printf("Finished in: %s\n", totalTime);
        System.out.printf("Summary: %d tests found | %d succeeded | %d failed | %d aborted\n",
                summary.getTestsFoundCount(),
                summary.getTestsSucceededCount(),
                summary.getTestsFailedCount(),
                summary.getTestsAbortedCount());
        System.out.println("-------------------------------------------------------\n");

        var failedTestIds = summary.getFailures().stream()
                .map(TestExecutionSummary.Failure::getTestIdentifier)
                .collect(Collectors.toSet());

        var testsByClass = allTests.stream()
                .filter(TestIdentifier::isTest)
                .collect(Collectors.groupingBy(id ->
                        id.getSource()
                                .filter(MethodSource.class::isInstance)
                                .map(MethodSource.class::cast)
                                .map(MethodSource::getClassName)
                                .orElse("UnknownClass")
                ));

        testsByClass.forEach((className, tests) -> {
            System.out.println("Results for: " + getSimpleClassName(className));
            for (TestIdentifier test : tests) {
                if (failedTestIds.contains(test)) {
                    String reason = summary.getFailures().stream()
                            .filter(f -> f.getTestIdentifier().equals(test))
                            .findFirst()
                            .map(f -> f.getException().getMessage())
                            .orElse("Unknown error");

                    System.out.println("   FAILED: " + test.getDisplayName() + " | Reason: " + reason);
                } else {
                    System.out.println("   PASSED: " + test.getDisplayName());
                }
            }
            System.out.println();
        });

        System.out.println("=======================================================");
        if (summary.getTestsFailedCount() == 0 && summary.getTestsFoundCount() > 0) {
            System.out.println("           All tests passed successfully!          ");
        } else if (summary.getTestsFoundCount() == 0) {
            System.out.println("              No tests were found.               ");
        } else {
            System.out.println("              Some tests failed.               ");
        }
        System.out.println("=======================================================");
    }
}

