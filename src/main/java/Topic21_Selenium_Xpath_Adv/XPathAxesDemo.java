
package Topic21_Selenium_Xpath_Adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BaseTest;

public class XPathAxesDemo extends BaseTest {




        public static void main(String[] args) {

            XPathAxesDemo obj = new XPathAxesDemo();
            obj.setup();

            // ===== Base Element =====
            WebElement javaCell = driver.findElement(By.xpath("//td[text()='Learn Java']"));

            // =========================
            // 1. PARENT
            // =========================
            WebElement parent = driver.findElement(By.xpath("//td[text()='Learn Java']/parent::tr"));
            System.out.println("PARENT: " + parent.getText());

            // =========================
            // 2. CHILD
            // =========================
            WebElement child = driver.findElement(By.xpath("//tr[td='Learn Java']/child::td[2]"));
            //I first locate the <tr> which contains the child elements (td), and pick the secondone.
            System.out.println("CHILD (Author): " + child.getText());

            // =========================
            // 3. ANCESTOR
            // =========================
            WebElement ancestor = driver.findElement(By.xpath("//td[text()='Learn Java']/ancestor::table"));
            System.out.println("ANCESTOR (Table displayed): " + ancestor.isDisplayed());

            // =========================
            // 4. DESCENDANT
            // =========================
            WebElement descendant = driver.findElement(By.xpath("//table[@name='BookTable']/descendant::td[text()='Selenium']"));
            System.out.println("DESCENDANT: " + descendant.getText());

            // =========================
            // 5. FOLLOWING
            // =========================
            WebElement following = driver.findElement(By.xpath("//td[text()='Learn Java']/following::td[1]"));
            System.out.println("FOLLOWING: " + following.getText());

            // =========================
            // 6. PRECEDING
            // =========================
            WebElement preceding = driver.findElement(By.xpath("//td[text()='Learn Java']/preceding::td[1]"));
            System.out.println("PRECEDING: " + preceding.getText());

            // =========================
            // 7. FOLLOWING-SIBLING
            // =========================
            WebElement followingSibling = driver.findElement(By.xpath("//td[text()='Learn Java']/following-sibling::td[1]"));
            System.out.println("FOLLOWING-SIBLING: " + followingSibling.getText());

            // =========================
            // 8. PRECEDING-SIBLING
            // =========================
            WebElement precedingSibling = driver.findElement(By.xpath("//td[text()='Amod']/preceding-sibling::td[1]"));
            System.out.println("PRECEDING-SIBLING: " + precedingSibling.getText());

            // =========================
            // 9. SELF
            // =========================
            WebElement self = driver.findElement(By.xpath("//td[text()='Learn Java']/self::td"));
            System.out.println("SELF: " + self.getText());

            obj.tearDown();
        }
    }

