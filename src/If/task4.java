package If;

public class task4 {
    public static void main(String[] args) {
        //Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.

        int [][] numbers={{20,21,23},
                          {19,18,17},
                          {3,7,4},};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }

            }

        }
    }
}
