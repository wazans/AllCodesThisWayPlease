package Selenium_Collections_Framework;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_SetAndMapInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		try {
			String path = System.getProperty("user.dir") + "/resources/DynamicTable.html";
			driver.get("file:///" + path);
			driver.manage().window().maximize();

			List<WebElement> rows = driver.findElements(By.cssSelector("#mixedTable tbody tr"));

			Set<String> uniqueRoles = new LinkedHashSet<>();
			Map<String, String> employeeStatusByName = new LinkedHashMap<>();

			for (WebElement row : rows) {
				List<WebElement> columns = row.findElements(By.tagName("td"));

				String employeeName = columns.get(1).getText();
				String role = columns.get(2).getText();
				String status = columns.get(3).getText();

				uniqueRoles.add(role);
				employeeStatusByName.put(employeeName, status);
			}

			System.out.println("Unique roles from the page: " + uniqueRoles);
			System.out.println("Employee status map: " + employeeStatusByName);
		} finally {
			driver.quit();
		}
	}
}
