package testngtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic15_OrangeHrmParameters {

    // Used in: suites/suite-orangehrm.xml
    // This test takes the OrangeHRM URL and login values from TestNG XML.
    @Test
    @Parameters({"orangeUrl", "orangeUsername", "orangePassword"})
    public void orangeHrmLoginUsingXmlParameters(@Optional("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login") String orangeUrl,
                                                 @Optional("Admin") String orangeUsername,
                                                 @Optional("admin123") String orangePassword) throws InterruptedException {
        // Starts the Chrome browser.
        WebDriver driver = new ChromeDriver();

        try {
            // Maximizes the browser window.
            driver.manage().window().maximize();

            // Opens the OrangeHRM login page.
            driver.get(orangeUrl);

            Thread.sleep(10000);

            // Finds the username input box.
            WebElement username = driver.findElement(By.xpath("//input[@name='username']"));

            // Finds the password input box.
            WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

            // Types the username taken from XML.
            username.sendKeys(orangeUsername);

            // Types the password taken from XML.
            password.sendKeys(orangePassword);

            // Finds the login button.
            WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

            // Clicks the login button.
            submitButton.click();

            // Prints a simple message so you know this test used XML parameters.
            System.out.println("OrangeHRM login submitted using TestNG XML parameters.");
        } finally {
            // Closes the browser after the test.
            driver.quit();
        }
    }
}
