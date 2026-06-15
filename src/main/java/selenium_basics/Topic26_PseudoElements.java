package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Topic26_PseudoElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		try {
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_before");

			// The example content is inside the result iframe, not the outer editor page.
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeResult")));

			WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));

			// Pseudo-elements are not normal DOM nodes, so read them through getComputedStyle().
			String beforeContent = (String) js.executeScript(
					"return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content');",
					heading);

			System.out.println("Heading text: " + heading.getText());
			System.out.println("::before content: " + beforeContent);
		} finally {
			driver.quit();
		}
	}
}
