package s1_SeleniumBasics;


import Utils.WaitUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.Assertion;

public class AssertDemo {
    public static WebDriver driver;

    public static void MouseAmazon() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        //WebElement signinlink= WaitUtils.ElementClickable(driver, By.id("nav-link-accountList"),10);
        //signinlink.click();
        WebElement signinlink= (WebElement) By.id("nav-link-accountList");
        Actions act=new Actions(driver);
        act.moveToElement(signinlink).build().perform();


    }
}
