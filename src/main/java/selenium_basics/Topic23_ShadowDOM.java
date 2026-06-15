package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Topic23_ShadowDOM {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/shadowdom");

			WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content my-paragraph")));
			SearchContext shadowRoot = shadowHost.getShadowRoot();

			String paragraphText = shadowRoot.findElement(By.cssSelector("[name='my-text']")).getText();
			String listText = shadowRoot.findElement(By.cssSelector("ul li")).getText();

			System.out.println("Shadow DOM text: " + paragraphText);
			System.out.println("Shadow DOM list item: " + listText);
		} finally {
			driver.quit();
		}
	}
}
