
package xpathfunctions;

import org.openqa.selenium.By;
import base.BaseTest;

public class XPathFunctionsDemo extends BaseTest {

    public static void main(String[] args) {

        XPathFunctionsDemo obj = new XPathFunctionsDemo();
        obj.setup();

        // contains
        driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("Contains");

        // starts-with
        driver.findElement(By.xpath("//input[starts-with(@id,'na')]")).clear();
        driver.findElement(By.xpath("//input[starts-with(@id,'na')]")).sendKeys("Starts");

        obj.tearDown();
    }
}
