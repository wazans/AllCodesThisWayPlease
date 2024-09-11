package s1_SeleniumBasics;

import Utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class O_CalenderSpecific {
    public static WebDriver driver;

    public static void CalenderSpecific() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
        driver.manage().window().maximize();
        WebElement cal_icon = driver.findElement(By.xpath("//input[@id='datetimepicker1']"));
        cal_icon.click();
        WebElement year= WaitUtils.ElementClickable(driver,By.cssSelector(".numInput"),10);
        year.clear();
        year.sendKeys("1989");
        Thread.sleep(10000);
        WebElement monthDropdown = driver.findElement(By.xpath("//select[@aria-label='Month']"));
        monthDropdown.click();
        monthDropdown.sendKeys("October");
        monthDropdown.sendKeys(Keys.ENTER);
        String date="20";
        WebElement Date = driver.findElement(By.xpath("//span[text( )='"+date+"']"));
        Thread.sleep(10000);

    }

    public static void main(String[] args) throws InterruptedException {
        CalenderSpecific();
    }

}
