package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel2 {

	
	@Test
	public void add() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\Eclipse DJ\\Maven\\src\\main\\resources\\Excel\\Test.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		Sheet sheet=workbook.getSheet("Company Management");
		Row row=sheet.getRow(1);
		Cell cell=row.createCell(4);
		cell.setCellValue("Passed");
		
		// To store the update data find the location to save the  file
		
		FileOutputStream fos=new FileOutputStream("E:\\Eclipse DJ\\Maven\\src\\main\\resources\\Excel\\Test.xlsx");
		
		// Write the content into required file.
		workbook.write(fos);
		// close the connection
		fos.close();
		System.out.println(" file Updated");
		
	
	}
	
}
