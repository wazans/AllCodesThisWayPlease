package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Topic24_CalendarHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/datepicker/");

			// The jQuery UI demo is inside an iframe, so switch before locating the calendar input.
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));

			WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("datepicker")));
			dateInput.click();

			// Navigate the calendar until the required month/year appears.
			while (true) {
				String month = driver.findElement(By.className("ui-datepicker-month")).getText();
				String year = driver.findElement(By.className("ui-datepicker-year")).getText();

				if (month.equals("December") && year.equals("2026")) {
					break;
				}

				driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
			}

			// Pick the target day from the visible date grid.
			driver.findElement(By.xpath("//a[text()='25']")).click();
			System.out.println("Selected date: " + dateInput.getAttribute("value"));
		} finally {
			driver.quit();
		}
	}
}
