package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class I_ExplicitWait {
    public static WebDriver driver;

    public static void Explicit_Demo() throws InterruptedException {
        driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autosuggest"))).click();
        driver.findElement(By.id("autosuggest")).sendKeys("IND");

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN);
        }
        driver.findElement(By.id("autosuggest")).sendKeys(Keys.ENTER);
    }

    public static void main(String[] args) throws InterruptedException {
        Explicit_Demo();
    }
}
