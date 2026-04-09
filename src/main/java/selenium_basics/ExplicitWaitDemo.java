package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {

    public static void main(String[] args) {



        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open local HTML file (update path)
        String path = System.getProperty("user.dir") + "/resources/explicit-wait-demo.html";

        driver.get("file:///" + path);


        // Create Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 1. Wait for hidden button to be visible
        WebElement hiddenButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("hiddenBtn"))
        );

        System.out.println("Button is now visible");

        // 2. Wait until button is clickable
        wait.until(ExpectedConditions.elementToBeClickable(hiddenButton));

        hiddenButton.click();

        System.out.println("Button clicked");

        // 3. Wait for message to appear
        WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("message"))
        );

        System.out.println("Message displayed: " + message.getText());

        driver.quit();
    }
}
