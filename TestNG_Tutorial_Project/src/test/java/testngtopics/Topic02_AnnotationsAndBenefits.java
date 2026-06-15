package testngtopics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Topic02_AnnotationsAndBenefits {

    // Runs once before all classes inside the current <test> block in XML.
    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest runs once before all test methods inside this <test> tag.");
    }

    // Runs once before this class starts running tests.
    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass runs once before the first method of this class.");
    }

    // Runs before every @Test method in this class.
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod runs before every @Test method.");
    }

    // priority decides the order when TestNG runs methods in the same class.
    @Test(priority = 1, description = "Simple example showing the first test execution.")
    public void testOne() {
        System.out.println("Test one executed.");
    }

    // This runs after the method with lower priority value.
    @Test(priority = 2, description = "Simple example showing the second test execution.")
    public void testTwo() {
        System.out.println("Test two executed.");
    }

    @Test
    public void testThree() {
        System.out.println("Test three executed.");
    }


    // Runs after every @Test method.
    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod runs after every @Test method.");
    }

    // Runs once after all tests in this class are done.
    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass runs once after all methods in this class.");
    }

    // Runs once after the whole XML <test> block finishes.
    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest runs once after all class execution inside this <test> tag.");
    }
}
