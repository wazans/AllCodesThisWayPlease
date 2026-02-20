package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic16_Keyboard {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("abc@test.com");
		Thread.sleep(5000);
		email.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(5000);
		email.sendKeys(Keys.DELETE);
		Thread.sleep(5000);
		driver.quit();
	}
}
