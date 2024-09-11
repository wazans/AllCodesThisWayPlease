package TestNGDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class B_CrossBrowserTesting {
    public WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void getBrowser(String browser)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            driver=new ChromeDriver();
        }
        if(browser.equalsIgnoreCase("firefox"))
        {
            driver=new FirefoxDriver();
        }
    }
    @Test
    public void Test1()
    {
        driver.get("https://chatgpt.com/");
    }
    @AfterMethod
    public void closeDriver()
    {
        driver.quit();
    }

}
