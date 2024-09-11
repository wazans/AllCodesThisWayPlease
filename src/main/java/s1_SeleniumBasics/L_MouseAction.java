package s1_SeleniumBasics;

import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class L_MouseAction {
    public static WebDriver driver;

    public static void MouseAmazon() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement signinlink=WaitUtils.ElementClickable(driver,By.id("nav-link-accountList"),10);
        //signinlink.click();
        Actions act=new Actions(driver);
        act.moveToElement(signinlink).build().perform();
        Assert.assertTrue(signinlink.isDisplayed());
        //Assert.assertEquals("omayo0000", driver.getTitle()); 
    }

    public static void main(String[] args) {
        MouseAmazon();
    }

}
