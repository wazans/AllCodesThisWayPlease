package ExcelReadWriteDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class WriteIntoExcel {

	public static void main(String[] args) {

		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		XSSFWorkbook workbook = null;

		try {
			File file = new File("C:\\Myfiles\\abc.xlsx");

			// Open existing file
			inputStream = new FileInputStream(file);
			workbook = new XSSFWorkbook(inputStream);
			inputStream.close(); // close input before writing

			XSSFSheet sheet = workbook.getSheetAt(0);

			// Get row (create if not exists)
			XSSFRow row = sheet.getRow(5);
			if (row == null) {
				row = sheet.createRow(5);
			}

			// Get cell (create if not exists)
			XSSFCell cell = row.getCell(1);
			if (cell == null) {
				cell = row.createCell(1);
			}

			// Set value
			cell.setCellValue("new value");

			// Write back to file
			outputStream = new FileOutputStream(file);
			workbook.write(outputStream);

			System.out.println("Data written successfully!");

		} catch (IOException e) {
			System.out.println("Error writing file");
			e.printStackTrace();
		} finally {
			try {
				if (workbook != null)
					workbook.close();
				if (outputStream != null)
					outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
