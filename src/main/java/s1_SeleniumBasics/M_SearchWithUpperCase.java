package s1_SeleniumBasics;

import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M_SearchWithUpperCase {
    public static WebDriver driver;

    public static void SearchWithUpperCase() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement searchBox=WaitUtils.ElementClickable(driver,By.xpath("//input[@id='twotabsearchtextbox']"),10);
        Actions act=new Actions(driver);
        //act.moveToElement(searchBox).build().perform();
        act.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("the wolf").build().perform();
    }

    public static void main(String[] args) {
        SearchWithUpperCase();
    }
}
