package If;
public class ArraysScanner {

    public static void main(String[] args) {

        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);

        //create method reduce10 here

    }

    static int [][] reduce10(int [][]a){

        for (int i = 0; i <=a.length; i++) {
            for (int j = 0; j <a[i].length ; j++) {

                System.out.print((a[i][j]-10)+ " ");
            }
            System.out.println();
        }
        return reduce10(a);

    }


}









