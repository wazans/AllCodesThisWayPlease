package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Topic21_AjaxHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

			driver.findElement(By.cssSelector("#start button")).click();
			String loadedText = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#finish h4"))).getText();
			System.out.println("Ajax loaded text: " + loadedText);
		} finally {
			driver.quit();
		}
	}
}
