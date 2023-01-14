package class8;

import java.util.Scanner;

public class DemoWithStringLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");

        while(sc.next().equalsIgnoreCase("Sha")){
            System.out.println("Great student who always wanted an example with String");
        }
    }
}
