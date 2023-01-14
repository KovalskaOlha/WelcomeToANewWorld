package class8;

public class NestedLoop2 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) { // outer for loop control how many lines will print

            for (int j = 0; j < 5; j++) {

               if(j==1 || j==2){
                   continue;
               }
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
