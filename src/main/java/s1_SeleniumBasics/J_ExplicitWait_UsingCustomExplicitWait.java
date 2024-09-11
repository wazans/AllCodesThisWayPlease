package s1_SeleniumBasics;

import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class J_ExplicitWait_UsingCustomExplicitWait {
    public static WebDriver driver;

    public static void Explicit_Demo() throws InterruptedException {
        driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement auto_box= WaitUtils.visibilityOfElementLocated_Self(driver,By.id("autosuggest"),5);
        auto_box.click();
        auto_box.sendKeys("IND");

        for (int i = 0; i < 5; i++) {
            auto_box.sendKeys(Keys.DOWN);
        }
        auto_box.sendKeys(Keys.ENTER);
    }

    public static void main(String[] args) throws InterruptedException {
        Explicit_Demo();
    }
}
