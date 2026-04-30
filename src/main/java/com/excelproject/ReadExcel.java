package com.excelproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	 public static void main(String[] args) {

	    	 try {
	        	
	    FileInputStream file = new FileInputStream("C:\\Users\\ACER\\eclipse-workspace-new\\ExcelProject\\employees.xlsx");
	           
	            Workbook workbook = new XSSFWorkbook(file);

	            Sheet sheet = workbook.getSheet("Sheet1");

	            for (Row row : sheet) {
	                for (Cell cell : row) {

	                    switch (cell.getCellType()) {

	                        case STRING:
	                            System.out.print(cell.getStringCellValue() + "\t");
	                            break;

	                        case NUMERIC:
	                            System.out.print(cell.getNumericCellValue() + "\t");
	                            break;

	                        case BOOLEAN:
	                            System.out.print(cell.getBooleanCellValue() + "\t");
	                            break;

	                        default:
	                            System.out.print(" \t");
	                    }
	                }
	                System.out.println();
	            }

	            workbook.close();
	            file.close();

	        } catch (IOException error) {
	            error.printStackTrace();
	        }
	    }
	}

