package ProjectGroup;

public class Task5 {
    public static void main(String[] args) {
        int [][]num={{88,33,22,7},
                {11,21,76,4},
                {10,26,5,9},};
        int sumOdd=0;
        int sumEven=0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j]%2==0){
                    sumEven=sumEven+num[i][j];
                }else if(num[i][j]%2 !=0){
                    sumOdd=sumOdd+num[i][j];
                }
            }
        }
        System.out.println( "The sum of even numbers is "+ sumEven);
        System.out.println(  "The sum of odd numbers is "+ sumOdd);
    }
}
