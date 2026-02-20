package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic1_IdLocator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		// ID locator is fastest if unique
		driver.findElement(By.id("checkbox1")).click();
		WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
		checkbox1.click();
		driver.quit();
	}
}
