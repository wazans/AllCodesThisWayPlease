package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class H_ImplicitWait {
    public static WebDriver driver;

    public static void Add_Cucumber_To_Cart() throws InterruptedException {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).click();
        driver.findElement(By.id("autosuggest")).sendKeys("IND");
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN);
        }
        driver.findElement(By.id("autosuggest")).sendKeys(Keys.ENTER);
    }
}
