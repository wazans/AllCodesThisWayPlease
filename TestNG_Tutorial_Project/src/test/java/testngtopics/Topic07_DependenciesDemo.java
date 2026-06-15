package testngtopics;

import org.testng.annotations.Test;

public class Topic07_DependenciesDemo {

    // This is the parent step.
    // Other tests can depend on this method or group.
    @Test(groups = {"setup"})
    public void Registration() {
        System.out.println("Registered.");
    }

    @Test(groups = {"setup"})
    public void SendOTP() {
        System.out.println("SendOTP.");
    }

    // This test will run only after registration passes.
    @Test(dependsOnMethods = {"Registration"})
    public void login() {
        System.out.println("You can login.");
    }

    // This test depends on the setup group, not on one specific method.
    @Test(groups = {"regression"}, dependsOnGroups = {"setup"})
    public void accountSummary() {
        System.out.println("Account summary runs after setup group.");
    }
}
