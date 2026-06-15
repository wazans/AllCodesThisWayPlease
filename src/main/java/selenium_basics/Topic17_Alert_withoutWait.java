package selenium_basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Topic17_Alert_withoutWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

// ================= WITHOUT WAIT =================
// Directly switch to alert
// Works only if alert appears immediately after click
// If alert is delayed → NoAlertPresentException will come
//        Alert jsAlert = driver.switchTo().alert();
//
//        System.out.println("Simple alert text (without wait): " + jsAlert.getText());
//        jsAlert.accept();


// ================= WITH EXPLICIT WAIT =================
// This is the recommended approach in real projects
// Waits until alert is present (max 10 seconds)
// Avoids flakiness and timing issues




driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

Alert jsAlertWait = wait.until(ExpectedConditions.alertIsPresent());

System.out.println("Simple alert text (with wait): " + jsAlertWait.getText());
jsAlertWait.accept();

    }
}
