package s1_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NoDriverExample {

	public static void main(String[] args) {
		// No manual driver setup required for Chrome, Firefox, or Edge
		// Selenium Manager automatically finds and downloads the compatible driver
		WebDriver driver = new ChromeDriver();

		try {
			// Navigate to a website
			driver.get("https://www.selenium.dev/selenium/web/web-form.html");

			// Get the title of the page
			String pageTitle = driver.getTitle();
			System.out.println("Page Title: " + pageTitle);

			// Find an element and interact with it
			WebElement textBox = driver.findElement(By.name("my-text"));
			textBox.sendKeys("Selenium No Driver Test");

			// Find and click a submit button
			WebElement submitButton = driver.findElement(By.cssSelector("button"));
			submitButton.click();

			// Verify a message after submission
			WebElement message = driver.findElement(By.id("message"));
			System.out.println("Form submission message: " + message.getText());

		} finally {
			// Close the browser
			driver.quit();
		}
	}
}
