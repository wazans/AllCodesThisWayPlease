package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Topic18_Frames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/iframe");

			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("mce_0_ifr")));
			WebElement editorBody = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tinymce")));
			editorBody.clear();
			editorBody.sendKeys("Inside the iFrame using Selenium.");

			driver.switchTo().defaultContent();
			System.out.println("Page heading: " + wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3"))).getText());
		} finally {
			driver.quit();
		}
	}
}
