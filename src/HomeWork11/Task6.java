package HomeWork11;

public class Task6 {
    public static void main(String[] args) {
        //Create 2D array of countries: north america countries,
        // south america countries, europe countries, asian countries,
        // african countries. Then print all values from that array using
        // 2 different loops and calculate how many total countries been stored

        String [][] countries={{"USA", "Mexico","Canada", "Guatemala"},
                               {"Brazil", "Argentina", "Colombia", "Bolivia"},
                               {"France","Germany","Spain","Portugal"},
                               {"India", "China", "Indonesia", "Pakistan"}};
        int total1=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                total1++;
            }
            System.out.println();


        }
        System.out.println("Total number of countries is "+total1);

        System.out.println("******************");
        int total2=0;
        for(String []arr:countries){
            for (String x:arr){
                total2++;
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println("Total number of countries is "+total2);
    }
}
