package com.excelproject;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
public class ExcelProject {

	public static void main(String[] args) {
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Sheet1");
		
		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Name");
		header.createCell(1).setCellValue("Age");
		header.createCell(2).setCellValue("Email");

	    Row r1 = sheet.createRow(1);
	    r1.createCell(0).setCellValue("John Doe");
	    r1.createCell(1).setCellValue(30);
	    r1.createCell(2).setCellValue("john@test.com");
	    
	    Row r2 = sheet.createRow(2);
	    r2.createCell(0).setCellValue("John Deane");
	    r2.createCell(1).setCellValue(28);
	    r2.createCell(2).setCellValue("jane@test.com");
	    
	    Row r3 = sheet.createRow(3);
	    r3.createCell(0).setCellValue("bob Smilth");
	    r3.createCell(1).setCellValue(35);
	    r3.createCell(2).setCellValue("jacky@example.com");
	    
	    Row r4 = sheet.createRow(4);
	    r4.createCell(0).setCellValue("Swapnil");
	    r4.createCell(1).setCellValue(37);
	    r4.createCell(2).setCellValue("swapnil@example.com");
	    
	    for (int i = 0; i < 3; i++) {
            sheet.autoSizeColumn(i);
        }
	    
	    try {
	    	FileOutputStream fileOut = new FileOutputStream ("employees.xlsx");
	    	workbook.write(fileOut);
	    	fileOut.close();
	    	workbook.close();
	    	
	    	System.out.println("Excel file created successfully!");
	    }
	    catch (IOException error) {
	    	error.printStackTrace();
	    }
	
	
	
	}
}
