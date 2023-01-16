package HomeWorkClass9;

import java.util.SortedMap;

public class task6 {
    public static void main(String[] args) {
        /*Create an array of countries.
         While retrieving all values from an array print capital for each country
         choose any five countries.*/
        String [] country={"France","USA","Spain","Portugal","Italy"};
        String capital;
        for (int i = 0; i < country.length; i++) {
            switch (country[i]){
                case "France":
                    capital="Paris";
                    System.out.println("The capital of "+country[i]+" is "+capital);
                    break;
                case"USA":
                    capital="Washington";
                    System.out.println("The capital of "+country[i]+" is "+capital);
                    break;
                case"Spain":
                    capital="Madrid";
                    System.out.println("The capital of "+country[i]+" is "+capital);
                    break;
                case"Portugal":
                    capital="Lisbon";
                    System.out.println("The capital of "+country[i]+" is "+capital);
                    break;
                case"Italy":
                    capital="Rome";
                    System.out.println("The capital of "+country[i]+" is "+capital);
                    break;

        }


        }


    }
}
