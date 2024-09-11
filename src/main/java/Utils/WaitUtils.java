package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

   public static WebElement mywaitforclickable(WebDriver driver,By locator,int timeunitinSeconds)
   {
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeunitinSeconds));
       return wait.until(ExpectedConditions.elementToBeClickable(locator));
   }
    public static WebElement visibilityOfElementLocated_Self(WebDriver driver, By locator,int timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement ElementClickable(WebDriver driver,By locator,int timeoutInSec)
    {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeoutInSec));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}
