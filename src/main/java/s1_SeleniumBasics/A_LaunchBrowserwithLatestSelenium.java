package s1_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class A_LaunchBrowserwithLatestSelenium {
    public static WebDriver driver;

    public static void testChromeLatestVersionWithSeleniumManager()
    {
        //driver=new ChromeDriver();
        driver=new EdgeDriver();
        driver.get("https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/");

    }

    public static void main(String[] args) {
        testChromeLatestVersionWithSeleniumManager();
    }
}
