package ProjectGroup;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String []arr=new String[5];
        System.out.println("Enter the country");
        arr[0]=scan.nextLine();
        arr[1]=scan.nextLine();
        arr[2]=scan.nextLine();
        arr[3]=scan.nextLine();
        arr[4]=scan.nextLine();

        String capital;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]){
                case "USA":
                    capital="Washington";
                    System.out.println(arr[0]+ " the capital is "+capital);
                    break;
                case "Spain":
                    capital= "Madrid";
                    System.out.println(arr[1]+ " the capital is "+capital);
                    break;
                case "Italy":
                    capital="Rome";
                    System.out.println(arr[2]+ " the capital is "+capital);
                    break;
                case "Ukraine":
                    capital="Kyiv";
                    System.out.println(arr[3]+ " the capital is "+capital);
                    break;
                case "France":
                    capital="France";
                    System.out.println(arr[4]+ " the capital is "+capital);
                    break;
                default:

            }

        }
        System.out.println("**************************");

        String [] countries={"USA","Spain","Italy","Ukraine","France"};
        String [] capitals={"Washington","Madrid","Rome","Kyiv","Paris"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println("The capital of " +countries[i]+" is "+capitals[i]);

        }
    }
}
