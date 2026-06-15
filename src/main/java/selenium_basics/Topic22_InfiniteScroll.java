package selenium_basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Topic22_InfiniteScroll {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/infinite_scroll");

			long previousHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();

			for (int i = 1; i <= 3; i++) {
				js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
				final long heightBeforeScroll = previousHeight;
				wait.until(webDriver -> {
					long updatedHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();
					return updatedHeight > heightBeforeScroll;
				});

				long currentHeight = ((Number) js.executeScript("return document.body.scrollHeight")).longValue();
				System.out.println("Scroll " + i + " height: " + currentHeight);

				if (currentHeight == previousHeight) {
					System.out.println("No more new content loaded.");
					break;
				}

				previousHeight = currentHeight;
			}
		} finally {
			driver.quit();
		}
	}
}
