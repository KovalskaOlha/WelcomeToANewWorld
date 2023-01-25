package If;

import java.util.Scanner;

public class aaaa {
    public static void main(String[] args) {

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int [] rowSum = new int [a.length];
        for (int i=0; i<a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            rowSum[i]=sum;
        }
        for (int i=0; i<rowSum.length; i++){
            System.out.println(rowSum[i]);
        }
    }


}
