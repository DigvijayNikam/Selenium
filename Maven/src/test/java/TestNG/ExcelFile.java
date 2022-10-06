package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class ExcelFile {
	@Test
	public void data() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\Eclipse DJ\\Maven\\src\\main\\resources\\Excel\\Test.xlsx");
		
		// Create workbook instance which  holding reference to .xlsx
		Workbook workbook=new XSSFWorkbook(fis);
		int sheetcount=workbook.getNumberOfSheets();
		System.out.println("Sheet count is = "+sheetcount);
		
		// Print all the sheets name from the excel file
		
		for(int i=0;i<sheetcount;i++) {
			String sheetname=workbook.getSheetName(i);
			System.out.println(" Sheet name is ="+sheetname);
		}
	// get the required sheet from excel
		Sheet sheet=workbook.getSheet("sheet1");
	
	}
	
	@Test
	public void getRowDetails() throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\Eclipse DJ\\Maven\\src\\main\\resources\\Excel\\Test.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		// Get the required sheet from excel
		Sheet sheet=workbook.getSheet("Company Management");
		int rowcount=sheet.getLastRowNum();	
		System.out.println("Row count is ="+rowcount);
		Row row=sheet.getRow(1);
	}

	@Test
	public void getCellDetails()throws IOException
	{
		FileInputStream fis=new FileInputStream("E:\\Eclipse DJ\\Maven\\src\\main\\resources\\Excel\\Test.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		Sheet sheet=workbook.getSheet("Company Management");
			
		Row row=sheet.getRow(0);
		int cellcount=row.getLastCellNum();
		System.out.println("Cell count on row 0 :"+cellcount);
		for(int i=0;i<cellcount;i++)
		{
			//	Cell col=row.getCell(i);
			//String cellData=col.getStringCellValue();
			System.out.println("cell data: "+row.getCell(i).getStringCellValue());
				
		}
	
	}
	
		

	
	@Test
	public void getDiffTypeOfCellData() throws IOException
	{
	
		FileInputStream fis=new FileInputStream("E:\\Eclipse DJ\\Maven\\src\\main\\resources\\Excel\\Test.xlsx");
		Workbook workbook=new XSSFWorkbook(fis);
		Sheet sheet=workbook.getSheet("Company Management");
		for(int j=0;j<=sheet.getLastRowNum();j++) {
			
		
		Row row=sheet.getRow(j);
		int cellcount=row.getLastCellNum();
		System.out.println(" Cell count : on row "+ j+" is= "+cellcount);
	
		for(int i=0;i<cellcount;i++)
		{
			Cell cell=row.getCell(i);
			switch(cell.getCellType())
			{
			case (Cell.CELL_TYPE_STRING):
				System.out.println("cell data is :"+cell.getStringCellValue());
			break;
			case(Cell.CELL_TYPE_NUMERIC):
				System.out.println("Cell data :"+ cell.getNumericCellValue());
			break;
			case(Cell.CELL_TYPE_BOOLEAN):System.out.println("Cell data : "+cell.getBooleanCellValue());
			break;
			default:System.out.println("Invalid cell details");
			break;
			}
		}
	System.out.println("\n");
	}
	}
}	
