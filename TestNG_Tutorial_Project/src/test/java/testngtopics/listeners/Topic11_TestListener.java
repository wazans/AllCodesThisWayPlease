package testngtopics.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Topic11_TestListener implements ITestListener {

    // Called when the current TestNG <test> block starts.
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Listener start: " + context.getName());
    }

    // Called just before a test method starts.
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Starting: " + result.getMethod().getMethodName());
    }

    // Called when a test method passes.
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Passed: " + result.getMethod().getMethodName());
    }

    // Called when a test method fails.
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failed: " + result.getMethod().getMethodName());
    }

    // Called after the current TestNG <test> block finishes.
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Listener finish: " + context.getName());
    }
}
