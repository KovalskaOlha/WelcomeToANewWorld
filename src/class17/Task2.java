package class17;

public class Task2 {
    public static String reverseStr(String input){
        return new StringBuilder(input).reverse().toString();
    }
//static method can be called by just writing the name of the class
    public static void main(String[] args) {
      //  Task2 task2=new Task2();
       // task2.reverseStr("Monday");
       reverseStr("Monday");// within a class we don't need even create a class obj
        System.out.println(reverseStr("Monday"));
    }
}
