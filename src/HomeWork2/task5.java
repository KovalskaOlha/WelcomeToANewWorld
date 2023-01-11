package HomeWork2;

public class task5 {
    public static void main(String[] args) {
        /* Write a program to find largest of three double values using
        if-else..if and logical operators provided by a user (numbers must be distinct)*/

        double a=32.1;
        double b=221.9;
        double c=70.7;
         if(a>b && b>c){
             System.out.println(a+" is the largest number");
         }else if(b>a && b>c){
             System.out.println(b+ " is the largest number");
         }else if(c>a && c>b){
             System.out.println(c+" is the largest number");
         }
    }
}
