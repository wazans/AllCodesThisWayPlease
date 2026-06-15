package testngtopics;

import org.testng.annotations.Test;

public class Topic12_ExceptionsInTestNG {

    // TestNG will mark this test as passed only if ArithmeticException happens.
    @Test(expectedExceptions = ArithmeticException.class)
    public void expectedExceptionDemo() {
        int value = 10 / 0;
        System.out.println(value);
    }

    // This example catches the exception inside the test itself.
    @Test
    public void handledExceptionDemo() {
        try {
            Integer.parseInt("abc");
        } catch (NumberFormatException ex) {
            System.out.println("Handled exception: " + ex.getMessage());
        }
    }
}
