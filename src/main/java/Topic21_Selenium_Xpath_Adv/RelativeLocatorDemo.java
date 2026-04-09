package Topic21_Selenium_Xpath_Adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorDemo {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String path = System.getProperty("user.dir") + "/resources/rel.html";


        driver.get("file:///" + path);
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));

        // 1. Find password label below username field
        WebElement passwordLabel = driver.findElement(
                with(By.tagName("label")).below(usernameInput)
        );
        System.out.println("Password Label: " + passwordLabel.getText());

        // 2. Find username label above username field
        WebElement usernameLabel = driver.findElement(
                with(By.tagName("label")).above(usernameInput)
        );
        System.out.println("Username Label: " + usernameLabel.getText());

        // 3. 👁 Button to the left of password input
        WebElement showBtn = driver.findElement(
                with(By.tagName("button")).toLeftOf(passwordInput)
        );
        System.out.println("Left of password: " + showBtn.getText());

        // 4. Password field to the right of 👁 button
        WebElement passwordField = driver.findElement(
                with(By.tagName("input")).toRightOf(showBtn)
        );
        System.out.println("Right of show button: " + passwordField.getAttribute("placeholder"));

        // 5. Login button near password input
        WebElement loginBtn = driver.findElement(
                with(By.tagName("button")).near(passwordInput)
        );
        System.out.println("Login button: " + loginBtn.getText());


        driver.quit();
    }
}
