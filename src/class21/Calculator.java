package class21;

public class Calculator {
    //overloading method below


    void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    void add(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    //or with a help of changing the data type
    // or with help of changing sequence
    void add(int num1, double num2){//int==>double
        System.out.println(num1+num2);
    }
    void add(double num1, int num2){
        System.out.println(num1+num2);
    }

}
