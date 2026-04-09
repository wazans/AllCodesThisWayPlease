package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic13_ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement email = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));


		email.sendKeys("test@test.com");
		Thread.sleep(5000);
		WebElement email1=driver.findElement(By.xpath("//input[@type='email']"));
		email1.click();
		email1.sendKeys("test@gmail.com");
		driver.quit();
	}
}
