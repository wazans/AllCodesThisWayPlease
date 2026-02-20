package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic2_NameLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		// Name locator used in forms
		driver.findElement(By.name("radiooptions")).click();
		Thread.sleep(5000); // Just for demonstration, avoid using Thread.sleep in real tests
		driver.quit();
	}
}
