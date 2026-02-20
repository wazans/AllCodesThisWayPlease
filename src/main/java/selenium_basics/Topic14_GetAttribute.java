package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic14_GetAttribute {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		System.out.println(email.getAttribute("placeholder"));
		System.out.println(email.getAttribute("class"));
		driver.quit();
	}
}
