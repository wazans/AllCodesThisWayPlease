package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Y_open_in_new_Tab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://www.saucedemo.com/v1/inventory.html");
        WebElement openlink=driver.findElement(By.xpath("//div[normalize-space()='Sauce Labs Backpack']"));
//        openlink.sendKeys(Keys.CONTROL,Keys.ENTER);
        openlink.click();
    }
}
