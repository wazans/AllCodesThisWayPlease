package s1_SeleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class U_JavaScript_Demo {
    public static WebDriver driver;
        public static   void sendKeys_usingJSE()
        {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            //document.getElementsByClassName('search-keyword')
            JavascriptExecutor jse=(JavascriptExecutor) driver;
            /*
            Type Casting: The (JavascriptExecutor) part is a type cast,
            which converts the driver object to the JavascriptExecutor type.
             */

            /*
            Purpose: This allows the use of the executeScript and executeAsyncScript methods
            provided by the JavascriptExecutor interface.
             */
            jse.executeScript("document.getElementsByClassName('search-keyword')[0].value='Cucumber';");


        }

    public static void main(String[] args) {
        sendKeys_usingJSE();
    }


}
