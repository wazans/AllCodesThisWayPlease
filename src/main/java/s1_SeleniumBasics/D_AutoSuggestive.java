package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class D_AutoSuggestive {
    public static WebDriver driver;
    public static void AutoSuggest() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("autosuggest")).sendKeys("IND");
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.id("autosuggest")).sendKeys(Keys.DOWN);
            Thread.sleep(5000);
        }
        driver.findElement(By.id("autosuggest")).sendKeys(Keys.ENTER);

    }

    public static void main(String[] args) throws InterruptedException {
        AutoSuggest();
    }

}
