
package Topic21_Selenium_Xpath_Adv;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class DynamicXpathDemo {

                public static void main(String[] args) throws InterruptedException {

                    // Launch browser
                    WebDriver driver = new ChromeDriver();

                    // Open local HTML file (update path)
                    String path = System.getProperty("user.dir") + "/resources/rel.html";

                    driver.get("file:///" + path);

                    driver.manage().window().maximize();

                    // Locate button
                    WebElement dynamicBtn = driver.findElement(By.id("dynamicBtn"));

                    // Click multiple times
                    for (int i = 0; i < 3; i++) {
                        dynamicBtn.click();
                        Thread.sleep(1000);

                        // --- XPath using AXES ---
                        WebElement dynamicText_xpath = driver.findElement(
                                    By.xpath("//button[@id='dynamicBtn']/following-sibling::p")
                        );

                        System.out.println("XPath Value: " + dynamicText_xpath.getText());

                        // --- Dynamic XPath ---
                        WebElement dynamicText_dynamic = driver.findElement(
                                By.xpath("//p[contains(text(),'Value')]")
                        );

                        System.out.println("Dynamic XPath Value: " + dynamicText_dynamic.getText());

                        // --- Selenium 4 Relative Locator ---
                        WebElement dynamicText_relative = driver.findElement(
                                RelativeLocator.with(By.tagName("p"))
                                        .below(By.id("dynamicBtn"))
                        );

                        System.out.println("Relative Locator Value: " + dynamicText_relative.getText());

                        System.out.println("----------------------");
                    }

                    // Close browser
                    driver.quit();
                }
            }


