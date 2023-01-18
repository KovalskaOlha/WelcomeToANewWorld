package class10;

public class TwoDArraysDemo1 {
    public static void main(String[] args) {

        // 2D arrays is not a matrix
        int [][] matrix={ {10,20,30},//0
                          {55,22,45,50},//1
                          {100,220,450},//2
                         };
        System.out.println(matrix[1][1]);//22
        System.out.println("____________________");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
