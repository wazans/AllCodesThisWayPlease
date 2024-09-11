package s1_SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class V_AuthenticationPopUp {
    public static WebDriver driver;

    public static void AuthenticationPopUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String a = "admin";
        // appending username, password with URL
        String s = "https://" + a + ":" + a + "@" +
                "the-internet.herokuapp.com/basic_auth";
        driver.get(s);
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
//        alert.sendKeys("abc");
//        alert.sendKeys(String.valueOf(Keys.TAB));
//        alert.sendKeys("xyz");

    }

    public static void main(String[] args) {
        AuthenticationPopUp();
    }
}
