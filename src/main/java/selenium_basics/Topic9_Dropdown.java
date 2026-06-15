package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Topic9_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Select s = new Select(driver.findElement(By.id("Skills")));
		//learn and use other methods as well
		Thread.sleep(11000);
		s.selectByVisibleText("C++");
		List<WebElement> options= s.getOptions();
		ArrayList<String> skillSet=new ArrayList<>();

		for(WebElement ele:options)
		{
			skillSet.add(ele.getText());
		}
		System.out.println(skillSet);
		Thread.sleep(5000);
		driver.quit();
	}
}
