package testngtopics;

import org.testng.annotations.Test;

public class Topic01_TestNGIntroduction {

    // This is the simplest TestNG test method.
    // TestNG will run this because of the @Test annotation.
    @Test
    public void methodM() {
        System.out.println("hello javatpoint");
    }

    // One class can contain many test cases.
    @Test
    public void methodM1() {
        System.out.println("hello");
    }

    // This is another test case in the same class.
    @Test
    public void methodM2() {
        System.out.println("HI");
    }
}
