package HomeWork12;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Mom's first name?");
        String mom=scan.nextLine();
        System.out.println("Dad’s first name?");
        String dad=scan.nextLine();
        System.out.println("Boy or girl?");
        String baby=scan.nextLine();
        if(baby.equals("boy")){
            System.out.println("Suggested name is "+dad.toUpperCase().substring(0,3)+mom.toUpperCase().substring(2,4));
        }else if(baby.equals("girl")){
            System.out.println("Suggested name is "+mom.toUpperCase().substring(0,2)+dad.toUpperCase().substring(3,6));
        }

    }
}
