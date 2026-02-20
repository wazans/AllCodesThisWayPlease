package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLoginWeb {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login");
//	     driver.findElement(By.id("username")).sendKeys("student");
//	     Thread.sleep(5000);
//	     driver.findElement(By.id("password")).sendKeys("Password123");
//	     Thread.sleep(5000);
//	     driver.findElement(By.id("submit")).click();
		System.out.println("Title of the page is: " + driver.getTitle());

		Thread.sleep(5000);
		driver.quit();

	}

}
