package Topic21_Selenium_Xpath_Adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathSimple {
    public static void main(String[] args) throws InterruptedException {
        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open local HTML file (update path)
        String path = System.getProperty("user.dir") + "/resources/rel.html";

        driver.get("file:///" + path);

        driver.manage().window().maximize();

        // Locate button
        WebElement dynamicBtn = driver.findElement(By.id("dynamicBtn"));


            dynamicBtn.click();
            Thread.sleep(1000);

            // --- XPath using AXES ---
            WebElement dynamicText_xpath = driver.findElement(
                    By.xpath("//button[@id='dynamicBtn']/following-sibling::p")
            );

            System.out.println("XPath Value: " + dynamicText_xpath.getText());
    }
}
