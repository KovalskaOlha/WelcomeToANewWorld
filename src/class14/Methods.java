package class14;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        int [] arr1={10,20,30,45,50};
        int sum =0;
        for (int num:arr1) {
            sum=sum+num;
        }
        System.out.println(sum);//155
        System.out.println(Arrays.toString(arr1));//[10, 20, 30, 45, 50]

        int [] array2={10,10,10,20,30};
        int sum2 =0;
        for (int num:array2) {
            sum2=sum2+num;
        }
        System.out.println(sum2);

    }

}
