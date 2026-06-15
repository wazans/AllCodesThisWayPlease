package testngtopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Topic16_OrangeHrmDataProvider {

    // Used in: suites/suite-orangehrm.xml
    // This test runs once for every row returned by the data provider below.
    //Run this test method multiple times using data from orangeLoginData
    @Test(dataProvider = "orangeLoginData")
    public void orangeHrmLoginUsingDataProvider(String orangeUrl, String orangeUsername, String orangePassword) throws InterruptedException {
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

            // Types the username from the current data provider row.
            username.sendKeys(orangeUsername);

            // Types the password from the current data provider row.
            password.sendKeys(orangePassword);

            // Finds the login button.
            WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

            // Clicks the login button.
            submitButton.click();

            // Prints the current username so each run is easy to identify.
            System.out.println("OrangeHRM login submitted using DataProvider for user: " + orangeUsername);
        } finally {
            // Closes the browser after each data-driven run.
            driver.quit();
        }
    }


/*    @Test
    public void test1() {}

    @Test
    public void test2() {}*/

    //DataProvider Method
    // This data provider method supplies multiple sets of login values.
    @DataProvider(name = "orangeLoginData")
    public Object[][] orangeLoginData() {
        return new Object[][]{
                {"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "Admin", "admin123"},
                {"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "Admin", "admin123"}
        };
    }
}
