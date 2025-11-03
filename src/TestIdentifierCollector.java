import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;

import java.util.ArrayList;
import java.util.Collection;

// A simple listener class to collect TestIdentifier objects
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