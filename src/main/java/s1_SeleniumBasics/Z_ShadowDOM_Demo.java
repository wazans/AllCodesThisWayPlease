package s1_SeleniumBasics;
import io.github.sukgu.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Z_ShadowDOM_Demo {
    public static WebDriver driver;
    public static   void iShadow() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://books-pwakit.appspot.com/");
        Shadow shadow = new Shadow(driver);
        WebElement element = shadow.findElementByXPath("//input[@id='input']");
        element.sendKeys("do it work");
    }

    public static void main(String[] args) {
        iShadow();
    }
}
