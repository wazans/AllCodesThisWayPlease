package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic19_WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
		Thread.sleep(5000);
		for (String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.quit();
		Thread.sleep(5000);

	}
}
