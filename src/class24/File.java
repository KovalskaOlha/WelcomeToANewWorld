package class24;

public abstract class File {
    /*Create a class File that will have the following behaviors:
     open, edit, close. Edit and close are implemented method
     while open is an abstract. Create 3 subclasses:
     JavaFile, WordFile, PdfFile that will provide
     specific implementation of open behaviour:
     Example: to open .java file we need notepad++
     or sublime text, to open .doc file we need
     Microsoft word to be installed etc*/

    abstract void open();
    void edit(){
        System.out.println("edit method of the File");
    }
    void close(){
        System.out.println("close method of the File");
    }
}
class JavaFile extends File{
    @Override
    void open() {
        System.out.println("To open .java file we need notepad++ ");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("To open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{
    @Override
    void open() {
        System.out.println("To open .pdf file we need PdFreader");
    }
}

class FileTester{
    public static void main(String[] args) {
        File [] arr={new JavaFile(),new PdfFile(),new WordFile()};
       /* for(File x:arr){
            x.close();
            x.open();
            x.edit();
        }  */

        for(int i=0; i<arr.length; i++){
            File f=arr[i];
            f.open();
            f.edit();
            f.close();
        }
    }
}
