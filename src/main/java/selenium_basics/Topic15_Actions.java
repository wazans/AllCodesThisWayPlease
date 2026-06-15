package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Topic15_Actions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions actions = new Actions(driver);

		try {
			driver.manage().window().maximize();

			driver.get("https://the-internet.herokuapp.com/drag_and_drop");
			WebElement source = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("column-a")));
			WebElement target = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("column-b")));

			actions.dragAndDrop(source, target).perform();
			System.out.println("After dragAndDrop, left header: " + driver.findElement(By.cssSelector("#column-a header")).getText());

			driver.navigate().refresh();
			source = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("column-a")));
			target = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("column-b")));

			actions.clickAndHold(source)
					.moveToElement(target)
					.pause(Duration.ofMillis(500))
					.release(target)
					.perform();
			System.out.println("After clickAndHold/release, left header: " + driver.findElement(By.cssSelector("#column-a header")).getText());

			WebElement pageHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
			actions.doubleClick(pageHeading).perform();
			System.out.println("doubleClick executed on page heading.");

			driver.get("https://the-internet.herokuapp.com/context_menu");
			WebElement hotSpot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hot-spot")));
			actions.contextClick(hotSpot).perform();
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println("Context click alert text: " + alert.getText());
			alert.accept();
		} finally {
			driver.quit();
		}
	}
}
