package HomeWork;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hello! What city are you from?");
        String city=input.nextLine();

        System.out.println("What is the current temperature?");
        int temp= input.nextInt();
        double temp2=(temp-32)/1.8;
        System.out.println("The temperature is "+temp2+" the city  is "+city);

    }
}
