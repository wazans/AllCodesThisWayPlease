package s1_SeleniumBasics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class P_ScreenShot {
    public static WebDriver driver;

    public static void myss() throws InterruptedException, IOException {
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
        // Capture the screenshot after adding the product to the cart
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination where the screenshot will be saved
        File destFile = new File("src/main/java/Utils/myss.png");
        FileUtils.copyFile(srcFile, destFile);
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        myss();
    }
}
