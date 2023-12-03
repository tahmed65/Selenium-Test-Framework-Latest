package com.facebook.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteFromExcel {
	
	public static XSSFSheet worksheet;

	public static XSSFWorkbook workbook;

	public static XSSFCell cell;

	public static XSSFRow Row;
	public static String path;
	
	
	
	public String readExcel(String wb,int sheetNum,int row,int col) throws IOException {
		        InputStream file = new FileInputStream("src/test/resources/testdata/"+wb);
		        XSSFWorkbook  workbook = new XSSFWorkbook(file);  
		        XSSFSheet worksheet=workbook.getSheetAt(sheetNum);
		        cell=worksheet.getRow(row).getCell(col);
		        String celldata=cell.toString();
		       // String celldata=cell.getStringCellValue();
		     //  System.out.println("File You reading: "+wb+" and cell value is: "+celldata);
			
		       return celldata;
			
			
		
		
		
	}
	
	
	
	
	
	
	public static void writeToExcel(String excelFile, int sheetNum, int rowNum, int cellNum, String result) throws IOException {
		    String excelFilePath = "src/test/resources/testdata/"+excelFile;
         
	     
	            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	            Workbook workbook = WorkbookFactory.create(inputStream);
	 
	            Sheet sheet = (Sheet) workbook.getSheetAt(sheetNum);
				
				
	          XSSFCell cell2Update = ((XSSFSheet) sheet).getRow(rowNum).getCell(cellNum);
	          cell2Update.setCellValue(result);
	 
	            
	 
	           
	 
	            inputStream.close();
	 
	            FileOutputStream outputStream = new FileOutputStream(excelFilePath);
	            workbook.write(outputStream);
	            workbook.close();
	            outputStream.close();
	             
	       
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


