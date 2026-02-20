package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic7_RadioButton {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement radioMale = driver.findElement(By.xpath("//input[@value='Male']"));
		//
		// driver.findElement(By.xpath("//input[@value='Male']")).click();
		radioMale.click();
		driver.quit();
	}
}
