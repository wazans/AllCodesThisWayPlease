package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;

public class selenium_elementactions {
    public static void m1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        WebElement element = driver.findElement(By.xpath("//input[@type='search']"));
        element.clear();
        element.click();
        element.sendKeys("Cauliflower");
        WebElement element1 = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
        String actualtext = element1.getText();
        String expectedtext = "ADD TO CART";
        Assert.assertEquals(actualtext,expectedtext);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='ADD TO CART']")));
       // element1.click();
        Actions action =new Actions(driver);
        action.moveToElement(element1).click().build().perform();
        action.moveToElement(element1).contextClick();
        driver.close();
        ArrayList<WebElement> ele= (ArrayList<WebElement>) driver.findElements(By.xpath("//*[tr]"));







    }

    public static void main(String[] args) {
        m1();
    }
}

