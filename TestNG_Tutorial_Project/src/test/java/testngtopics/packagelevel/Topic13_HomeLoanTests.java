package testngtopics.packagelevel;

import org.testng.annotations.Test;

public class Topic13_HomeLoanTests {

    // This is one home loan related test.
    @Test
    public void homeLoanWebLogin() {
        System.out.println("Home loan web login.");
    }

    // This is another home loan related test.
    @Test
    public void homeLoanApiLogin() {
        System.out.println("Home loan API login.");
    }
}
