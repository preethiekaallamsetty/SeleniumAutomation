package excelExample;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream(".\\data\\RegisterStudent.xls");
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		
		HSSFSheet  sheet = workbook.getSheet("Student");		//SheetName - smokeTest/Student
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
