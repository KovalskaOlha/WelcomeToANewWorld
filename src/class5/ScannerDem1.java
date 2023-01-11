package class5;

import java.util.Scanner;

public class ScannerDem1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //System.in=> tells the computer we want to read the data from keyboard
       /* System.out.println("Please enter your age");
        int age= scanner.nextInt();
        System.out.println("You are "+age+" Years old");

        System.out.println("please enter your weight");
        double weight= scanner.nextDouble();
        System.out.println("Your weight is  "+weight+" kg");
        System.out.println("are you hungry");
        boolean hungry= scanner.nextBoolean();
        System.out.println("hungry "+hungry);*/
        System.out.println("please enter your gender");
        char gender= scanner.next().charAt(0);
        System.out.println("your gender is "+gender);


        System.out.println("Please enter your name");
        String name= scanner.next();//when we have to taken only one word as input
        System.out.println("Your name is "+name);

        scanner.nextLine();// trick to make nextLine method work after any other method
        System.out.println("Enter your full name");
        String fullName= scanner.nextLine();
        System.out.println("Your full name is "+fullName);

        scanner.close();//good practice
    }
}
