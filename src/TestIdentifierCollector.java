import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;

import java.util.ArrayList;
import java.util.Collection;

/**
 * A simple listener implementation that collects {@link TestIdentifier} objects
 * during a JUnit test run. This class is used to keep track of all executed tests,
 * allowing for detailed summaries and reports to be generated afterward.
 *
 * <p>Specifically, only identifiers that represent actual test methods (not containers)
 * are stored in the internal collection.</p>
 *
 * <p>Usage example:</p>
 * <pre>{@code
 * Launcher launcher = LauncherFactory.create();
 * TestIdentifierCollector collector = new TestIdentifierCollector();
 * launcher.registerTestExecutionListeners(collector);
 * }</pre>
 */
class TestIdentifierCollector implements TestExecutionListener {
    private final Collection<TestIdentifier> tests = new ArrayList<>();

    @Override
    public void executionFinished(TestIdentifier testIdentifier, org.junit.platform.engine.TestExecutionResult testExecutionResult) {
        if(testIdentifier.isTest()) {
            tests.add(testIdentifier);
        }
    }

    public Collection<TestIdentifier> getTestIdentifiers() {
        return tests;
    }
}