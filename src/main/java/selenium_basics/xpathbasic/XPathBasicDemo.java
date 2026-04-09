
package xpathbasic;

import org.openqa.selenium.By;
import base.BaseTest;

public class XPathBasicDemo extends BaseTest {

    public static void main(String[] args) {

        XPathBasicDemo obj = new XPathBasicDemo();
        obj.setup();

        // basic xpath
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("XPath");

        obj.tearDown();
    }
}
