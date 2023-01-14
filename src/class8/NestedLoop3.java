package class8;

public class NestedLoop3 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) { // outer for loop control how many lines will print
             if(i==1){
                 System.out.println();
                 continue;
             }
            for (int j = 0; j < 5; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
