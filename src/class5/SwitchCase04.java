package class5;

import java.util.Scanner;

public class SwitchCase04 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your gender mM/fF");
        char gender=sc.next().charAt(0);

        switch (gender){
            case'f':
            case'F':
                System.out.println("Female");
                break;
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }

    }
}
