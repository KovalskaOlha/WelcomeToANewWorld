package HomeWork11;

public class Task2 {
    public static void main(String[] args) {
        //Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops

        String  [][] cars={{"Ford","Cadillac","Chevrolette"},
                           {"Audi","Porsche","BMW"},
                           {"Hyundai","Kia","SsangYong"},
                           {"Lambo","Alfa Romeo","Fiat"}};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");

            }
            System.out.println();


        }
        System.out.println("_____________________________");


        for(String []arr :cars){
            for (String x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
