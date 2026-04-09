package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Q_ListinAutomation {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Correct path
		String path = System.getProperty("user.dir") + "/resources/DynamicTable.html";
		driver.get("file:///" + path);

		driver.manage().window().maximize();

		// ✅ Only tbody rows (skip header)
		List<WebElement> tablerows = driver.findElements(
				By.cssSelector("#mixedTable tbody tr"));

		for (WebElement row : tablerows) {

			// ✅ Always use relative XPath
			List<WebElement> columns = row.findElements(By.xpath("./td"));

			// Safety check
			if (columns.size() > 1) {
				String name = columns.get(1).getText(); // Name column
				System.out.println(name);
			}
		}

		driver.quit();
	}
}