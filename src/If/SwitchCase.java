package If;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SwitchCase {
    public static void main(String[] args) {
        int month=13;

        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Not a valid number");
        }

        String weather= "Love";
        switch(weather){
            case "Sunny":
                System.out.println("Let's go to the beach");
                break;
            case"Rainy":
                System.out.println("let's go to a movie");
                break;
            case"Foggy":
                System.out.println("Let's stay a t home");
            default:
                System.out.println("I don't know what to say");
        }

        String[] name= new String[5];
        name[0]="Anna";
        name[1]="Steve";
        name[2]="Sasha";
        name[3]="Peter";
        name[4]="Alex";
        System.out.println(name[3]);

        System.out.println("************************");

        ArrayList nameList=new ArrayList();
        nameList.add("Katya");
        nameList.add("Ivan");
        nameList.add("Angie");
        System.out.println(nameList);


    }
}
