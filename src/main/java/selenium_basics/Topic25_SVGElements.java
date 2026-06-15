package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Topic25_SVGElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			driver.manage().window().maximize();
			driver.get("https://www.w3schools.com/graphics/tryit.asp?filename=trysvg_script1");

			// W3Schools renders the actual SVG demo inside the result iframe.
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeResult")));

			// SVG elements are easiest to target with local-name() when namespaces are involved.
			WebElement circle = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[local-name()='svg']//*[local-name()='circle' and @id='circle1']")));
			System.out.println("Radius before click: " + circle.getAttribute("r"));

			driver.findElement(By.cssSelector("input[type='button']")).click();

			// Read the SVG attribute again to verify the SVG element changed after interaction.
			wait.until(ExpectedConditions.attributeToBe(circle, "r", "50"));
			System.out.println("Radius after click: " + circle.getAttribute("r"));
		} finally {
			driver.quit();
		}
	}
}
