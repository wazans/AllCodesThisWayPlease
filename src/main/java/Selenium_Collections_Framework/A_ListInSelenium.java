package Selenium_Collections_Framework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_ListInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		try {
			String path = System.getProperty("user.dir") + "/resources/DynamicTable.html";
			driver.get("file:///" + path);
			driver.manage().window().maximize();

			List<WebElement> rows = driver.findElements(By.cssSelector("#mixedTable tbody tr"));
			List<String> activeEmployees = new ArrayList<>();

			System.out.println("Total rows found: " + rows.size());

			for (WebElement row : rows) {
				List<WebElement> columns = row.findElements(By.tagName("td"));

				String employeeId = columns.get(0).getText();
				String employeeName = columns.get(1).getText();
				String employeeStatus = columns.get(3).getText();

				System.out.println(employeeId + " - " + employeeName + " - " + employeeStatus);

				if ("Active".equalsIgnoreCase(employeeStatus)) {
					activeEmployees.add(employeeName);
				}
			}

			System.out.println("Active employees: " + activeEmployees);
		} finally {
			driver.quit();
		}
	}
}
