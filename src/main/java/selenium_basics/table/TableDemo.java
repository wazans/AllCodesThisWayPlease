
package table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BaseTest;

public class TableDemo extends BaseTest {

    public static void main(String[] args) {

        TableDemo obj = new TableDemo();
        obj.setup();

        // static table
        WebElement cell = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]/td[1]"));
        System.out.println("Book Name: " + cell.getText());

        // last row
        WebElement last = driver.findElement(By.xpath("//table[@name='BookTable']//tr[last()]"));
        System.out.println(last.getText());

        obj.tearDown();
    }
}
