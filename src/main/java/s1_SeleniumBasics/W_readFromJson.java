package s1_SeleniumBasics;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class W_readFromJson {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path for the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @DataProvider(name = "formData")
    public Object[][] formData() throws IOException {
        // Read JSON data
        FileReader reader = new FileReader("data.json");
        StringBuilder jsonString = new StringBuilder();
        int ch;
        while ((ch = reader.read()) != -1) {
            jsonString.append((char) ch);
        }
        reader.close();

        JSONArray jsonArray = new JSONArray(jsonString.toString());
        Object[][] data = new Object[jsonArray.length()][3];

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject json = jsonArray.getJSONObject(i);
            data[i][0] = json.getString("name");
            data[i][1] = json.getString("email");
            data[i][2] = json.getString("password");
        }

        return data;
    }

    @Test(dataProvider = "formData")
    public void testRegistrationForm(String name, String email, String password) {
        WebElement nameField = driver.findElement(By.id("name"));
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        WebElement message = driver.findElement(By.id("message"));

        nameField.clear();
        emailField.clear();
        passwordField.clear();

        nameField.sendKeys(name);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        submitButton.click();

        // Assert that the registration success message is displayed
        Assert.assertTrue(message.isDisplayed(), "Registration successful message is not displayed.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
