package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Topic4_CssSelectorDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String path = System.getProperty("user.dir") + "/resources/sample.html";


        driver.get("file:///" + path);

        // ============================
        // 1. Using ID
        // ============================
        // HTML: <h1 id="main-title">Welcome</h1>
        WebElement title = driver.findElement(By.cssSelector("#main-title"));
        System.out.println("Using ID: " + title.getText());

        // ============================
        // 2. Using CLASS
        // ============================
        // HTML: <p class="text">Child 1</p>
        List<WebElement> texts = driver.findElements(By.cssSelector(".text"));
        System.out.println("Using CLASS count: " + texts.size());


        // ============================
        // 3. Using TAG
        // ============================
        // HTML: <p class="text">Child 1</p>
        List<WebElement> paragraphs = driver.findElements(By.tagName("p"));
        System.out.println("Using TAG count: " + paragraphs.size());

        // ============================
        // 4. Using TAG + ID
        // ============================
        // HTML: <div class="box" id="parent">   html-tag#id-value
        WebElement parent = driver.findElement(By.cssSelector("div#parent"));
        System.out.println("TAG + ID: " + parent.getAttribute("id"));

        // ============================
        // 5. Using TAG + CLASS
        // ============================
        // HTML: <li class="item">Item 1</li>
        List<WebElement> items = driver.findElements(By.cssSelector("li.item"));
        System.out.println("TAG + CLASS count: " + items.size());

        // ============================
        // 6. Using TAG + ATTRIBUTE
        // ============================
        // HTML: <input type="text" id="username" placeholder="Enter name"/>
        //html-tag[@Attribute-name='atttribute-value'] --> Xpath sysntax
        //html-tag[Attribute-name='atttribute-value']  --> Xpath sysntax
        //#username --> #id-value
        //input#username  --> htmltag#id-value
        WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
        username.sendKeys("Wasim");

        // ============================
        // 7. Direct Child (>)
        // ============================
        // HTML: <p class="text">Child 1</p>
        //Give me only direct children (one level down)
        List<WebElement> directChildren = driver.findElements(By.cssSelector("#parent > p"));
        System.out.println("Direct children count: " + directChildren.size());

        // ============================
        // 8. Child or Subchild (space)
        // ============================
        // HTML: <span class="text">Child 3</span>
        //Find span anywhere inside parent (any depth)
        List<WebElement> allChildren = driver.findElements(By.cssSelector("#parent span"));
        System.out.println("Subchild found: " + allChildren.size());

        // ============================
        // 9. nth-child
        // ============================
        // HTML: <li class="item">Item 2</li>
        //Give me 2nd child of parent
        WebElement secondItem = driver.findElement(By.cssSelector("#list li:nth-child(2)"));
        System.out.println("2nd item: " + secondItem.getText());

        // ============================
        // 10. Siblings (+)
        // ============================
        // HTML: <li class="item">Item 2</li>
        //Find next element (immediate sibling)
        WebElement sibling = driver.findElement(By.cssSelector(".item + .item"));
        System.out.println("Sibling: " + sibling.getText());

        // ============================
        // 11. Starts with (^)
        // ============================
        // HTML: <input type="text" id="username" placeholder="Enter name"/>
        //id starts with ‘user
        WebElement start = driver.findElement(By.cssSelector("input[id^='user']"));
        start.clear();
        start.sendKeys("StartsWith");

        // ============================
        // 12. Ends with ($)
        // ============================
        // HTML: <input type="password" id="password" placeholder="Enter password"/>
        //id ends with ‘word’”
        WebElement end = driver.findElement(By.cssSelector("input[id$='word']"));
        end.clear();
        end.sendKeys("EndsWith");

        // ============================
        // 13. Contains (*)
        // ============================
        // HTML: <input type="password" id="password" placeholder="Enter password"/>
        //id contains ‘pass’ anywhere
        WebElement contain = driver.findElement(By.cssSelector("input[id*='pass']"));
        contain.sendKeys("Contains");

        driver.quit();
    }
}