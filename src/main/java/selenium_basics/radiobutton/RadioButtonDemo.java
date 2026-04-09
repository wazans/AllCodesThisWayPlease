
package radiobutton;

import org.openqa.selenium.By;
import base.BaseTest;

public class RadioButtonDemo extends BaseTest {

    public static void main(String[] args) {

        RadioButtonDemo obj = new RadioButtonDemo();
        obj.setup();

        driver.findElement(By.id("male")).click();

        obj.tearDown();
    }
}
