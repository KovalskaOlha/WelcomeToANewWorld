package ExelDemoTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/test2.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("Name","James");
        properties.setProperty("Age","33");
        properties.setProperty("Country","USA");
        properties.setProperty("SSN","12345678");
        properties.store(fileOutputStream,"New data has been added");

    }
}
