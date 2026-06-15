package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Topic19_WindowHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/windows");

			String parentWindow = driver.getWindowHandle();
			System.out.println("Parent window handle: " + parentWindow);

			driver.findElement(By.linkText("Click Here")).click();
			wait.until(ExpectedConditions.numberOfWindowsToBe(2));

			Set<String> allWindows = driver.getWindowHandles();
			System.out.println("All window handles: " + allWindows);

			for (String windowHandle : allWindows) {
				if (!windowHandle.equals(parentWindow)) {
					driver.switchTo().window(windowHandle);
					System.out.println("Child page heading: " + wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3"))).getText());
					driver.close();
					break;
				}
			}

			driver.switchTo().window(parentWindow);
			System.out.println("Back on parent page heading: " + wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3"))).getText());
		} finally {
			driver.quit();
		}
	}
}
