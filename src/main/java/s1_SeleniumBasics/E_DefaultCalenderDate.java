package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_DefaultCalenderDate {
    public static WebDriver driver;

    public static void Cal_auto_date() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(5000);
        //a[@value='MAA']    --- this will try to select the 'chennai' from the source and will fail so rather use next line
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        //or to avoid indexing use parent-xpath//child-xpath
        ////div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] selects the complete destination window

        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

    }

    public static void main(String[] args) throws InterruptedException {
        Cal_auto_date();
    }
}
