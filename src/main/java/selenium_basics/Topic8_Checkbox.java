package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic8_Checkbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement cb = driver.findElement(By.id("checkbox1"));
		cb.click();// selcted
		Thread.sleep(5000);
		System.out.println(cb.isSelected());
		driver.quit();
	}
}
