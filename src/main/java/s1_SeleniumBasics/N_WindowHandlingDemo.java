package s1_SeleniumBasics;

import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class N_WindowHandlingDemo {
    public static WebDriver driver;

    public static void WindowSwitch() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        WebElement blinkinLink_openin_new_windw = driver.findElement(By.xpath("//a[@class='blinkingText']"));
        blinkinLink_openin_new_windw.click();
        Set<String> window_ids = driver.getWindowHandles();
        Iterator<String> itr = window_ids.iterator();
        String Parent_window = itr.next();
        String child_window = itr.next();
        driver.switchTo().window(child_window);
        String myemailid = driver.findElement(By.xpath("//a[normalize-space()='mentor@rahulshettyacademy.com']")).getText();
        driver.switchTo().window(Parent_window);
        WebElement useridBox = driver.findElement(By.xpath("//input[@id='username']"));
        useridBox.click();
        useridBox.sendKeys(myemailid);
    }

    public static void main(String[] args) {
        WindowSwitch();
    }
}


