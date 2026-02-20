package ExcelReadWriteDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class ReadFromExcel {

	public static void main(String[] args) {

		try {
			File file = new File("C:\\Myfiles\\abc.xlsx");
			FileInputStream inputStream = new FileInputStream(file);

			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = workbook.getSheetAt(0);

			XSSFRow row = sheet.getRow(3);
			XSSFCell cell = row.getCell(1);

			System.out.println("Cell Value: " + cell.toString());

			workbook.close();
			inputStream.close();

		} catch (IOException e) {
			System.out.println("Error reading file");
			e.printStackTrace();
		}

	}

}
