package class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {
    public static void main(String[] args) {


       String name="abeera";
       if(name.length()<8){
           throw new LazyException("Lazy person found");
       }
    }
}
