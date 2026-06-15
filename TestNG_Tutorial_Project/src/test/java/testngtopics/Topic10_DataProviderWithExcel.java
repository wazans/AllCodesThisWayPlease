package testngtopics;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Topic10_DataProviderWithExcel {

    // The Excel file will be created inside the target folder during the test run.
    private static final Path EXCEL_PATH = Paths.get("target", "generated-test-data", "LoginData.xlsx");

    // This runs once before the class and creates a sample Excel file if it is missing.
    @BeforeClass
    public void createExcelIfMissing() throws IOException {
        Files.createDirectories(EXCEL_PATH.getParent());

        if (Files.exists(EXCEL_PATH)) {
            return;
        }

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("LoginData");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("username");
            headerRow.createCell(1).setCellValue("password");

            Row rowOne = sheet.createRow(1);
            rowOne.createCell(0).setCellValue("excel_user_1");
            rowOne.createCell(1).setCellValue("excel_pass_1");

            Row rowTwo = sheet.createRow(2);
            rowTwo.createCell(0).setCellValue("excel_user_2");
            rowTwo.createCell(1).setCellValue("excel_pass_2");

            try (OutputStream outputStream = Files.newOutputStream(EXCEL_PATH)) {
                workbook.write(outputStream);
            }
        }
    }

    // This test reads username and password rows from Excel.
    @Test(dataProvider = "excelData")
    public void loginFromExcel(String username, String password) {
        System.out.println("Excel Username: " + username + ", Excel Password: " + password);
    }

    // This method reads the Excel file and sends data back to TestNG.
    @DataProvider(name = "excelData")
    public Object[][] excelData() throws IOException {
        try (InputStream inputStream = Files.newInputStream(EXCEL_PATH);
             Workbook workbook = new XSSFWorkbook(inputStream)) {

            Sheet sheet = workbook.getSheet("LoginData");
            int rowCount = sheet.getPhysicalNumberOfRows();
            Object[][] data = new Object[rowCount - 1][2];

            for (int rowIndex = 1; rowIndex < rowCount; rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                data[rowIndex - 1][0] = getCellValue(row.getCell(0));
                data[rowIndex - 1][1] = getCellValue(row.getCell(1));
            }

            return data;
        }
    }

    // Converts a cell value to String so the demo stays simple.
    private String getCellValue(Cell cell) {
        return cell == null ? "" : cell.toString();
    }
}
