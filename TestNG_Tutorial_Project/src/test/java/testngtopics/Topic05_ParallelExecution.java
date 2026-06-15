package testngtopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Topic05_ParallelExecution {

    // This method launches Chrome and opens Amazon.
    // When suite XML uses parallel="methods", this runs in parallel with the Firefox test below.
    @Test
    public void chromeAmazonTest() {
        // Starts Chrome browser.
        WebDriver driver = new ChromeDriver();

        try {
            // Maximizes the browser window.
            driver.manage().window().maximize();

            // Opens Amazon in Chrome.
            driver.get("https://www.amazon.in/");

            // Prints the current thread so parallel execution is easy to see.
            System.out.println("Chrome test running on thread: " + Thread.currentThread().getName());

            // Waits a little so you can see the browser.
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            // Closes Chrome after the test.
            driver.quit();
        }
    }

    // This method launches Firefox and opens Amazon.
    // It should run at the same time as the Chrome test when parallel mode is enabled in XML.
    @Test
    public void firefoxAmazonTest() {
        // Starts Firefox browser.
        WebDriver driver = new FirefoxDriver();

        try {
            // Maximizes the browser window.
            //driver.manage().window().maximize();

            // Opens Amazon in Firefox.
            driver.get("https://www.amazon.in/");

            // Prints the current thread so parallel execution is easy to see.
            System.out.println("Firefox test running on thread: " + Thread.currentThread().getName());

            // Waits a little so you can see the browser.
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            // Closes Firefox after the test.
            driver.quit();
        }
    }
}
