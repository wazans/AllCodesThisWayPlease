package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Q_ListinAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        //List<WebElement> tablerows=driver.findElements(By.xpath("//table/tbody/tr"));
        List<WebElement> tablerows=driver.findElements(By.cssSelector("tr"));
        for(WebElement iter:tablerows)
        {
            List<WebElement> column=iter.findElements(By.xpath("td"));
            String get_value=column.get(2).getText();
            System.out.println(get_value);

        }
    }
}
