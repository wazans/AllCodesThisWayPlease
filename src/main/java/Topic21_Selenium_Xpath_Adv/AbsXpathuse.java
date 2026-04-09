package Topic21_Selenium_Xpath_Adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsXpathuse {
    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open local HTML file (update path)
        String path = System.getProperty("user.dir") + "/resources/DynamicTable.html";

        driver.get("file:///" + path);

        driver.manage().window().maximize();

        driver.findElement(By.id("updateBtn")).click();

        String dynamic_score=driver.findElement(By.xpath("/html/body/h3/following-sibling::table/tbody/tr[1]/td[5]")).getText();

        System.out.println(dynamic_score);
    }
}
