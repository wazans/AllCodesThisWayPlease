package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic5_Xpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		// Relative XPath preferred
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("976543256");
		Thread.sleep(5000);
		driver.quit();
	}
}
