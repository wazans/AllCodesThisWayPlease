package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;

public class Topic9_Dropdown_country {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		WebElement countryDropdown = driver.findElement(By.id("country"));
		Select s = new Select(countryDropdown);

		// 1. Select by Visible Text
		s.selectByVisibleText("India");

		Thread.sleep(2000);

		// 2. Select by Value
		s.selectByValue("India");   // value attribute from HTML

		Thread.sleep(2000);

		// 3. Select by Index
		s.selectByIndex(1);

		// 4. getOptions() → get all dropdown values
		List<WebElement> allOptions = s.getOptions();

		System.out.println("All dropdown values:");
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}

		// 5.  🔥 IMPORTANT: deselectAll() works only for multi-select
		if (s.isMultiple()) {
			s.deselectAll();
			System.out.println("All options deselected");
		} else {
			System.out.println("Dropdown is NOT multi-select → deselectAll() will fail");
		}

		Thread.sleep(3000);
		driver.quit();

		Thread.sleep(3000);

		driver.quit();
	}
}
