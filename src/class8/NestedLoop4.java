package class8;

public class NestedLoop4 {
    public static void main(String[] args) {

        /*
        12345
        12345
        12345
        */

        /*for (int i = 0; i < 3; i++) {
            for (int j = 1; j <6 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }*/
        for (int i=0;i<3;i++){
            if (i == 0) {
                for (int j=0; j<=5;j++) {
                    System.out.print(j + " ");
                }
            } else if (i==1){
                for (int j=1; j<=5;j++) {
                    System.out.print(j + " ");
                }
            } else if (i==2) {
                for (int j=2; j<=5; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        System.out.println("___________________");
        for (int k = 0; k < 3; k++) {
            for(int q=k; q<6; q++) {
                System.out.print(q + " ");
            }
            System.out.println();
        }
    }
}
