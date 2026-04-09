
package locators;

import org.openqa.selenium.By;
import base.BaseTest;

public class LocatorDemo extends BaseTest {

    public static void main(String[] args) {

        LocatorDemo obj = new LocatorDemo();
        obj.setup();

        // ID locator
        driver.findElement(By.id("name")).sendKeys("Wasim");

        // XPath locator
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@test.com");

        // CSS selector
        driver.findElement(By.cssSelector("#phone")).sendKeys("9999999999");

        obj.tearDown();
    }
}
