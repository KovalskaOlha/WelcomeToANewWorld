package ProjectGroup;

public class Task3 {
    public static void main(String[] args) {
        int [][] arr={  {3,5,8},
                {7,21,9},
                {4,65,2},
        };
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum=sum+ arr[i][j];

            }

        }System.out.println(sum);
    }
}
