package class27;

public class BoxingDemo {
    public static void main(String[] args) {
        int number=15;// in main method is primitive< but in method printData use the wrapper class
        printData(number);//autoboxing converted into class type
        Integer f=10;//autoBoxing
        int number2=f;


    }
    public static void printData(Integer number){// Integer is a class
        System.out.println(number);
    }
}
