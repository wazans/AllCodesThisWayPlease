package TestNGDemo;

import org.testng.annotations.Test;

public class TestNG_Groups_Demo {

    @Test(groups = "smoke")
    public void loginTest() {
        System.out.println("Login Test - Smoke");
    }

    @Test(groups = "smoke")
    public void logoutTest() {
        System.out.println("Logout Test - Smoke");
    }

    @Test(groups = "regression")
    public void paymentTest() {
        System.out.println("Payment Test - Regression");
    }

    @Test(groups = {"regression", "sanity"})
    public void profileUpdateTest() {
        System.out.println("Profile Update - Regression & Sanity");
    }
}
