package s1_SeleniumBasics;

import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class K_ExplicitWait_with_custom_explicit {
    public static WebDriver driver;
    public static void SearchGoogleAutoSuggest()
    {
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement search_box= WaitUtils.mywaitforclickable(driver,By.name("q"),5);
        search_box.sendKeys("IPL");
        WaitUtils.visibilityOfElementLocated_Self(driver,By.xpath("//ul[@role='listbox']"),10);
        for (int i = 0; i < 4; i++) {

            search_box.sendKeys(Keys.DOWN);


        }
        search_box.sendKeys(Keys.ENTER);
    }

    public static void main(String[] args) {
        SearchGoogleAutoSuggest();
    }

}
