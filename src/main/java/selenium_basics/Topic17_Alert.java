package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Topic17_Alert {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");



			driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
			Alert confirmDismissAlert = wait.until(ExpectedConditions.alertIsPresent());
			//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
			System.out.println("Confirm alert text before dismiss: " + confirmDismissAlert.getText());
			confirmDismissAlert.dismiss();
			System.out.println("After dismiss: " + wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText());

			driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
			Alert confirmAcceptAlert = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Confirm alert text before accept: " + confirmAcceptAlert.getText());
			confirmAcceptAlert.accept();
			System.out.println("After accept: " + wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText());

			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Prompt alert text: " + promptAlert.getText());
			promptAlert.sendKeys("MyTest");
			promptAlert.accept();

			System.out.println("Result message: " + driver.findElement(By.id("result")).getText());
		} finally {
			//driver.quit();
		}
	}
}
