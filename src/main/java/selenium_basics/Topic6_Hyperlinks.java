package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Topic6_Hyperlinks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//blank
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		//driver.findElement(By.linkText("Video")).click();
		Thread.sleep(5000);
		//driver.navigate().back();
		driver.findElement(By.partialLinkText("WebT")).click();

	}
}
