package class3;

import java.util.Scanner;

public class HomePracticeScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=scan.next();
        System.out.println(name);


        System.out.println("What is your age?");
        int age=scan.nextInt();

        System.out.println("Where are you from?");
        String home=scan.next();
        home=home+scan.nextLine();

        System.out.println("Thank you "+name+" your age is "+age+" you are from "+home);


    }
}
