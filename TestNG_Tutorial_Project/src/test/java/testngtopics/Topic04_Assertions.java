package testngtopics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Topic04_Assertions {

    // Hard assert stops the current test immediately if it fails.
    @Test
    public void hardAssertDemo() {
        String actualTitle = "TestNG Tutorial";
        String expectedTitle = "TestNG Tutorial";

        // Since both values are equal, this test continues.
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("This prints because the hard assertion passed.");
    }

    // Soft assert collects failures and lets the test continue.
    @Test
    public void softAssertDemo() {
        SoftAssert softAssert = new SoftAssert();

        // This fails, but execution still continues for now.
        softAssert.assertEquals("abc", "xyz", "Soft assertion failed but execution continues.");
        System.out.println("This line runs even after soft assertion failure.");

        // This is required, otherwise soft assertion failures are not reported properly.
        softAssert.assertAll();
    }
}
