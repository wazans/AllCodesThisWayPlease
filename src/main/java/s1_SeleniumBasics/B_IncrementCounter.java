package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_IncrementCounter {
    public static WebDriver driver;

    public static void test_IncrementCounter()
    {
        //driver=new ChromeDriver();
        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        for (int i = 0; i <=4 ; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }


    }

    public static void main(String[] args) {

        test_IncrementCounter();
    }
}
