package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class F_AddToCartSpecific {
    public static WebDriver driver;

    public static void Add_Cucumber_To_Cart() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
        List<WebElement> allproducts = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < allproducts.size(); i++) {
            String myproduct = allproducts.get(i).getText();
            if (myproduct.contains("Cucumber")) {
                driver.findElement(By.xpath("//div[3]//div[3]//button[1]")).click();
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Add_Cucumber_To_Cart();
    }
}
