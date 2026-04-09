package s1_SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo2 {

    public static void main(String[] args) {



        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open local HTML file (update path)
        String path = System.getProperty("user.dir") + "/resources/explicit-wait-demo.html";

        driver.get("file:///" + path);


        // Create Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 1. presenceOfElementLocated (only DOM)
        WebElement elementPresent = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("btn"))
        );
        System.out.println("Element is present in DOM");

        // 2. visibilityOfElementLocated
        WebElement visibleElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("text"))
        );
        System.out.println("Element is visible: " + visibleElement.getText());

        // 3. elementToBeClickable
        WebElement clickableBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("btn"))
        );
        clickableBtn.click();
        System.out.println("Button clicked");

        // 4. alertIsPresent
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("Alert text: " + alert.getText());

        alert.accept();

        driver.quit();
    }
}
