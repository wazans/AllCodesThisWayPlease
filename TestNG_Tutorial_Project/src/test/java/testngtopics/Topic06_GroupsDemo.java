package testngtopics;

import org.testng.annotations.Test;

public class Topic06_GroupsDemo {

    // One test can belong to multiple groups.
    @Test(groups = {"sanity", "smoke"})
    public void openApplication() {
        System.out.println("Open application.");
    }

    // This test belongs only to the sanity group.
    @Test(groups = {"sanity"})
    public void loginTest() {
        System.out.println("Login test.");
    }

    // This test will run if XML includes the regression group.
    @Test(groups = {"regression"})
    public void loanCalculationTest() {
        System.out.println("Loan calculation test.");
    }

    // Another regression test.
    @Test(groups = {"regression"})
    public void statementDownloadTest() {
        System.out.println("Statement download test.");
    }
}
