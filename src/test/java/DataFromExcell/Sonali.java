package DataFromExcell;

import com.google.common.collect.Table;
import gherkin.formatter.model.Row;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sonali {

    public static void main (String [] args) throws IOException, FileNotFoundException {
//Path of the excel file
        FileInputStream fs = new FileInputStream("D:\\DemoFile.xlsx");
//Creating a workbook

        FileInputStream file= new FileInputStream("/home/nandkumar/Downloads/")
        XSSFWorkbXSSFWorkbookook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Table.Cell cell = row.getCell(0);
        System.out.println(sheet.getRow(0).getCell(0));
        Row row1 = sheet.getRow(1);
        Table.Cell cell1 = row1.getCell(1);
        System.out.println(sheet.getRow(0).getCell(1));
        Row row2 = sheet.getRow(1);
        Table.Cell cell2 = row2.getCell(1);
        System.out.println(sheet.getRow(1).getCell(0));
        Row row3 = sheet.getRow(1);
        Table.Cell cell3 = row3.getCell(1);
        System.out.println(sheet.getRow(1).getCell(1));
//String cellval = cell.getStringCellValue();
//System.out.println(cellval);
    }}
