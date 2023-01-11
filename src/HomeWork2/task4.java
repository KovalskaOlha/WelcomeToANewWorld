package HomeWork2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month=sc.nextLine();
        switch (month){
            case "December":
            case"January":
            case"February":
                System.out.println("You were born in Winter");
                break;
            case"March":
            case"April":
            case"May":
                System.out.println("You were born in Spring");
                break;
            case"June":
            case"July":
            case"August":
                System.out.println("You were born in Summer");
                break;
            case "September":
            case"October":
            case"November":
                System.out.println("You were born in Fall");
                break;


        }
    }
}
