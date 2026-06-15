package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBasicAuth {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            // This approach works without CDP support by sending credentials in the URL itself.
            // Your previous HasAuthentication.register(...) code failed because Chrome 146 does not
            // have a matching Selenium DevTools module on this classpath.
            driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

            // Prints the success message from the page so you can confirm the login worked.
            String pageMessage = driver.findElement(By.cssSelector(".example p")).getText();
            System.out.println(pageMessage);
        } finally {
            driver.quit();
        }
    }
}
