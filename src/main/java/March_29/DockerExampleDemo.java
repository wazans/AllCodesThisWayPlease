package March_29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerExampleDemo {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444"),
                new ChromeOptions()
        );
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.quit();


    }
}
