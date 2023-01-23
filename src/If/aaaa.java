package If;

import java.util.Scanner;

public class aaaa {
    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int sumRow1=0;
        for( int i=0; i==0; i++){
            for (int j=0; j<=2; j++){
                sumRow1=sumRow1+a[i][j];

            }
            System.out.println(sumRow1);
        }
        int sumRow2=0;
        for (int i = 1; i==1; i++) {
            for (int j = 0; j <=2; j++) {
                sumRow2= sumRow2+ a[i][j];

            }
            System.out.println(sumRow2);
        }
    }
}