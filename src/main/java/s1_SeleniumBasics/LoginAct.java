package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\LENOVO\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@test.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("diff@test.com");
		Thread.sleep(5000);
		driver.quit();
	}

}
