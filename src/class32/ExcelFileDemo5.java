package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {
        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        //a class that we can use to read and write a data from Excel
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");
        int numbOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(numbOfRows);

        for (int i = 0; i < numbOfRows; i++) {
            //method to get all the rows one by one
            Row row = sheet2.getRow(i);
            // System.out.println(row.getCell(0)+" "+row.getCell(1));
            int numbOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < numbOfCells; j++) {
                System.out.print(row.getCell(j) + " ");
            }
            System.out.println();
        }



    }
}
