package com.excelproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddSheet2 {

	    public static void main(String[] args) {
	    	
	    	String filePath = System.getProperty("user.dir")
	    	        + File.separator + "employees.xlsx";
	    	
	    	

	        try {
	           
	            FileInputStream fileIn = new FileInputStream(filePath);
	            Workbook workbook = new XSSFWorkbook(fileIn);
	            fileIn.close();

	        
	            Sheet sheet = workbook.createSheet("Products");

	         
	            Row header = sheet.createRow(0);
	            header.createCell(0).setCellValue("Product");
	            header.createCell(1).setCellValue("Price");
	            header.createCell(2).setCellValue("Discounted Price");

	            
	            Row row1 = sheet.createRow(1);
	            row1.createCell(0).setCellValue("Laptop");
	            row1.createCell(1).setCellValue(50000);
	            row1.createCell(2).setCellValue(40000);

	            Row row2 = sheet.createRow(2);
	            row2.createCell(0).setCellValue("Mobile");
	            row2.createCell(1).setCellValue(20000);
	            row2.createCell(2).setCellValue(15000);
	            
	            Row row3 = sheet.createRow(3);
	            row3.createCell(0).setCellValue("TV");
	            row3.createCell(1).setCellValue(90000);
	            row3.createCell(2).setCellValue(85000);
	            
	            Row row4 = sheet.createRow(4);
	            row4.createCell(0).setCellValue("AC");
	            row4.createCell(1).setCellValue(80000);
	            row4.createCell(2).setCellValue(75000);
	            
	            Row row5 = sheet.createRow(5);
	            row5.createCell(0).setCellValue("Fridge");
	            row5.createCell(1).setCellValue(90000);
	            row5.createCell(2).setCellValue(85000);

	         
	            for (int i = 0; i < 3; i++) {
	                sheet.autoSizeColumn(i);
	            }

	          
	            FileOutputStream fileOut = new FileOutputStream(filePath);
	            workbook.write(fileOut);
	            fileOut.close();
	            workbook.close();

	            System.out.println("New sheet added successfully!");

	        } 
	            
	            catch (IOException error) {
	            error.printStackTrace();
	        }
	    
	}


}