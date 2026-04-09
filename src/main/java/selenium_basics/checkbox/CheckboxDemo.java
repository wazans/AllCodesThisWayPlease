
package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BaseTest;

public class CheckboxDemo extends BaseTest {

    public static void main(String[] args) {

        CheckboxDemo obj = new CheckboxDemo();
        obj.setup();

        WebElement monday = driver.findElement(By.id("monday"));

        System.out.println(monday.isDisplayed());
        System.out.println(monday.isEnabled());

        monday.click();

        obj.tearDown();
    }
}
