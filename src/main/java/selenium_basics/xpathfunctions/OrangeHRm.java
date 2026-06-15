package selenium_basics.xpathfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRm {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        WebElement submit_button=driver.findElement(By.xpath("//button[@type='submit']"));
        submit_button.click();

    }
}
