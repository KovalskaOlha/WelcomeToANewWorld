package HomeWorkClass9;

public class task5 {
    public static void main(String[] args) {
        /*Create an array of size 5 on integers and calculate
        the sum of all elements in an array.*/
        int [] arr=new int[5];
        arr[0]=2;
        arr[1]=3;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}
