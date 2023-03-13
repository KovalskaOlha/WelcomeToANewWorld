package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo7 {
    public static void main(String[] args) throws IOException {
        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet2=xssfWorkbook.getSheet("Sheet1");
        int numbOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(numbOfRows);

        List<Map<String,String>> excelData=new ArrayList<>();
        //extracted the row
        Row row0=sheet2.getRow(0);//header part
        for (int i = 1; i < numbOfRows; i++) {
            Row row = sheet2.getRow(i);
            LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                rowMap.put(row0.getCell(j).toString(),row.getCell(j).toString());
            }


            excelData.add(rowMap);
        }
        System.out.println(excelData);

    }
}
