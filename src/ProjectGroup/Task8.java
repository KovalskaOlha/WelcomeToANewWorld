package ProjectGroup;

public class Task8 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of Fibonacci series.


        int first=0;
        int second=1;
        int n=10;
        System.out.print(first+" "+second);
        for (int i = 2; i <n ; i++) {
            int third = second+first;
            System.out.print(" "+third);
            first=second;
            second=third;


        }


    }
}
