package class32;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo8 {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> excelData= ExcelReader.read();//or var excelData
       // Map<String,String> firstRow =excelData.get(1);
       // System.out.println(firstRow.get("salary"));

        for(Map<String,String>row:excelData){
            for(Map.Entry<String,String> entry:row.entrySet()){// or var entry
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("****************");
        }



    }
}
