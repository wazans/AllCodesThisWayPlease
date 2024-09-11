package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TableHand {
    public static WebDriver driver;

    public static void Table_me() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        WebElement FifthRowSecondElement = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        String s = FifthRowSecondElement.getText();
        System.out.println(s);
    }

    public static void main(String[] args) throws InterruptedException {
        Table_me();
    }
}
