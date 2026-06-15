package testngtopics;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Topic17_OrangeHrmDataProviderWithExcel {

    // Used in: suites/suite-orangehrm.xml
    // This file is created automatically so you do not need to prepare Excel manually.
    private static final Path EXCEL_PATH = Paths.get("target", "generated-test-data", "OrangeHrmLoginData.xlsx");

    // This runs once before the class and creates sample OrangeHRM login data in Excel.
    @BeforeClass
    public void createExcelIfMissing() throws IOException, InterruptedException {
        Files.createDirectories(EXCEL_PATH.getParent());

        if (Files.exists(EXCEL_PATH)) {
            return;
        }

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("OrangeHrmLogin");

            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("url");
            header.createCell(1).setCellValue("username");
            header.createCell(2).setCellValue("password");

            Row rowOne = sheet.createRow(1);
            rowOne.createCell(0).setCellValue("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            rowOne.createCell(1).setCellValue("Admin");
            rowOne.createCell(2).setCellValue("admin123");

            Row rowTwo = sheet.createRow(2);
            rowTwo.createCell(0).setCellValue("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            rowTwo.createCell(1).setCellValue("Admin");
            rowTwo.createCell(2).setCellValue("admin123");

            try (OutputStream outputStream = Files.newOutputStream(EXCEL_PATH)) {
                workbook.write(outputStream);
            }
        }
    }

    // This test runs once for every row read from the Excel file.
    @Test(dataProvider = "orangeHrmExcelData")
    public void orangeHrmLoginUsingExcel(String url, String usernameValue, String passwordValue) throws InterruptedException {
        // Starts the Chrome browser.
        WebDriver driver = new ChromeDriver();

        try {
            // Maximizes the browser window.
            driver.manage().window().maximize();

            // Opens the OrangeHRM login page.
            driver.get(url);

            Thread.sleep(10000);

            // Finds the username input field.
            WebElement username = driver.findElement(By.xpath("//input[@name='username']"));

            // Finds the password input field.
            WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

            // Types the username from Excel.
            username.sendKeys(usernameValue);

            // Types the password from Excel.
            password.sendKeys(passwordValue);

            // Finds the submit button.
            WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));

            // Clicks the login button.
            submitButton.click();

            // Prints the current row values so the run is easy to understand.
            System.out.println("OrangeHRM login submitted using Excel for user: " + usernameValue);
        } finally {
            // Closes the browser after each run.
            driver.quit();
        }
    }

    // This method reads data from the Excel file and gives it to TestNG.
    @DataProvider(name = "orangeHrmExcelData")
    public Object[][] orangeHrmExcelData() throws IOException {
        try (InputStream inputStream = Files.newInputStream(EXCEL_PATH);
             Workbook workbook = new XSSFWorkbook(inputStream)) {

            Sheet sheet = workbook.getSheet("OrangeHrmLogin");
            int rowCount = sheet.getPhysicalNumberOfRows();
            Object[][] data = new Object[rowCount - 1][3];

            for (int rowIndex = 1; rowIndex < rowCount; rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                data[rowIndex - 1][0] = row.getCell(0).toString();
                data[rowIndex - 1][1] = row.getCell(1).toString();
                data[rowIndex - 1][2] = row.getCell(2).toString();
            }

            return data;
        }
    }
}
