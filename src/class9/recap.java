package class9;

public class recap {
    public static void main(String[] args) {
        /*Nested loop
        a for loop inside another for loop


        */
       // for (int i = 0; i < 5; i++) {
         //   System.out.print("#");

        //}
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        int sum=0;

        for (int k = 0; k <10 ; k++) {
            sum=sum+k;

        }
        System.out.println(sum);
    }}
