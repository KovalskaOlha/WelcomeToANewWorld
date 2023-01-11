package If;

import java.util.Scanner;

public class ScannerBoolean {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter first");
        int num1= scan.nextInt();
        System.out.println("please enter second");
        int num2= scan.nextInt();
        if(num1*num2>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
