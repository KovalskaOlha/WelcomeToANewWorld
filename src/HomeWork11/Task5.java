package HomeWork11;

public class Task5 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        // Develop a program which will identify/print the even numbers only.

        int [][] arr= {{12,11,22,31},
                       {7,2,71,44},
                      {61,21,52,54},
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] %2==0){
                    System.out.print(arr [i][j]+" ");
                }

            }

        }
    }
}
