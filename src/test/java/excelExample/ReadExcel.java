package excelExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream(".\\data\\RegistrationData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		XSSFSheet  sheet = workbook.getSheet("Student");		//SheetName - smokeTest/Student
		//workbook.getSheetAt(2); 			//index start from 0
		
		
		//RowCount
		int rowCount = sheet.getLastRowNum();	
		
//		sheet.getLastRowNum()
//		sheet.getFirstRowNum()
		
		
		//int rowCountAll = sheet.getPhysicalNumberOfRows();				//6
		
		//columnCOunt
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("Rows count: " + rowCount);
		System.out.println("column count: " + columnCount);
		//System.out.println("Rows count All: " + rowCountAll);

		
		for (int i = 1; i <= rowCount; i++) {
			
			
			String firstName = sheet.getRow(i).getCell(0).toString();
			String address = sheet.getRow(i).getCell(4).toString();
			System.out.println("FirstName: " + firstName);
			System.out.println("Address: " + address);
			System.out.println("----------------------------");
			
		}
		
		
		
		
	}

	
	
}
