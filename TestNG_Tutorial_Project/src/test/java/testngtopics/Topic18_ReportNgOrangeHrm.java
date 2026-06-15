package testngtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Topic18_ReportNgOrangeHrm {

    // Used in: suites/suite-reportng-orangehrm.xml
    // This test passes and shows how a successful Selenium test appears in ReportNG.
    @Test
    public void orangeHrmLoginPagePassExample() {
        // Starts the Chrome browser.
        WebDriver driver = new ChromeDriver();

        try {
            // Maximizes the browser window.
            //driver.manage().window().maximize();

            // Opens the OrangeHRM login page.
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Finds the username field to confirm the page loaded correctly.
            WebElement username = driver.findElement(By.xpath("//input[@name='username']"));

            // Logs a message that will appear in TestNG and ReportNG reports.
            Reporter.log("Username field found on OrangeHRM login page.", true);

            // Confirms the username field is displayed.
            Assert.assertTrue(username.isDisplayed(), "Username field should be visible.");
        } finally {
            // Closes the browser.
            driver.quit();
        }
    }

    // Used in: suites/suite-reportng-orangehrm.xml
    // This test fails on purpose so the ReportNG report shows failed output too.
    @Test
    public void orangeHrmIntentionalFailureExample() {
        // Starts the Chrome browser.
        WebDriver driver = new ChromeDriver();

        try {
            // Maximizes the browser window.
            driver.manage().window().maximize();

            // Opens the OrangeHRM login page.
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Gets the page title.
            String actualTitle = driver.getTitle();

            // Logs the title so it becomes visible in the report.
            Reporter.log("Actual page title is: " + actualTitle, true);

            // This assertion is intentionally wrong so ReportNG can show a failed test.
            Assert.assertEquals(actualTitle, "OrangeHRM Dashboard", "Intentional failure for ReportNG demo.");
        } finally {
            // Closes the browser.
            driver.quit();
        }
    }
}
