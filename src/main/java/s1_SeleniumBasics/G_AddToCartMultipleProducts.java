package s1_SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class G_AddToCartMultipleProducts {
    public static WebDriver driver;

    public static void Add_Multiple_To_Cart() {
        String veggies[]={"Brocolli","Cauliflower","Beans"};
        List itemneededList=Arrays.asList(veggies);
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/#");
        List<WebElement> allproducts = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < allproducts.size(); i++) {
            String myproduct = allproducts.get(i).getText();
            String myproductafteSplit[] = myproduct.split("-");
            String formattedName=myproductafteSplit[0].trim();

            if (itemneededList.contains(formattedName)) {
                driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
            }
        }
    }

    public static void main(String[] args) {

        Add_Multiple_To_Cart();


    }
}
