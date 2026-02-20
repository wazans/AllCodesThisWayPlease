package TestNGDemo;

import org.testng.annotations.*;

public class TestNG_Lifecycle_Demo {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Runs once before entire suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Runs once after entire suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Runs before <test> tag in xml");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test - Runs after <test> tag in xml");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Runs once before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - Runs once after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method - Runs before every @Test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method - Runs after every @Test");
    }

    @Test
    public void B() {
        System.out.println("Executing Test B ");
    }

    @Test
    public void A() {
        System.out.println("Executing Test A");
    }
}
