package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic20_HTMLTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// Load local dynamic_table.html
		driver.get("file:///C:/Users/LENOVO/Downloads/selenium_basics_extended_project/dynamic_table.html");
		java.util.List<WebElement> rows = driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr"));
		System.out.println("Total Rows: " + rows.size());
		driver.quit();
	}
}
