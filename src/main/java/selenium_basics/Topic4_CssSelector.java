package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic4_CssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		// CSS: #id .class tag[attr='value']
		driver.findElement(By.cssSelector("#checkbox1")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
