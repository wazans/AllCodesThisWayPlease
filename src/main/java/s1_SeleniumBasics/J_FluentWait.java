package s1_SeleniumBasics;

// Imports the Selenium locator class.
import org.openqa.selenium.By;
// Imports the WebDriver interface.
import org.openqa.selenium.WebDriver;
// Imports the WebElement interface.
import org.openqa.selenium.WebElement;
// Imports the Chrome browser driver.
import org.openqa.selenium.chrome.ChromeDriver;
// Imports FluentWait for custom wait configuration.
import org.openqa.selenium.support.ui.FluentWait;
// Imports the generic Wait interface.
import org.openqa.selenium.support.ui.Wait;

// Imports Duration for timeout and polling values.
import java.time.Duration;
// Imports NoSuchElementException so FluentWait can ignore it while polling.
import java.util.NoSuchElementException;

// Demo class for Selenium 4 FluentWait.
public class J_FluentWait {

	// Main method to run this class directly.
	public static void main(String[] args) {

		// Launches a new Chrome browser window.
		WebDriver driver = new ChromeDriver();

		try {
			// Builds the full path of the local HTML file from the project folder.
			String path = System.getProperty("user.dir") + "/resources/explicit-wait-demo.html";

			// Opens the local HTML file in the browser.
			driver.get("file:///" + path);

			// Creates a Selenium 4 FluentWait object for the WebDriver.
			Wait<WebDriver> wait = new FluentWait<>(driver)
					// Sets the maximum time to wait before failing.
					.withTimeout(Duration.ofSeconds(10))
					// Checks again every 500 milliseconds.
					.pollingEvery(Duration.ofMillis(500))
					// Ignores this exception while the element is not yet present.
					.ignoring(NoSuchElementException.class);

			// Waits until the hidden button becomes visible and returns that element.
			WebElement button = wait.until(currentDriver -> {
				// currentDriver is just the WebDriver variable name inside this lambda.
				// It is the same browser driver object that was passed into FluentWait above.
				// This name is not special. You could also use names like driver or d here.

				// Finds the button using its id from the HTML file.
				WebElement foundButton = currentDriver.findElement(By.id("btn"));

				// Returns the button only when it becomes visible.
				if (foundButton.isDisplayed()) {
					return foundButton;
				}

				// Returns null so FluentWait keeps polling.
				return null;
			});

			// Clicks the button after FluentWait successfully finds it visible.
			button.click();

			// Prints a confirmation message in the console.
			System.out.println("FluentWait found the button and clicked it.");
		} finally {
			// Closes the browser even if an error happens.
			driver.quit();
		}
	}
}
