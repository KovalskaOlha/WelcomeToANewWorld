package class9;

public class ArraysDemo8 {
    public static void main(String[] args) {

        //write the program that will show how many times 10.5 is inside the arrays
        int count=0;
        double [] arr={10.5,12.0,45,10.5,23,10.5};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==10.5){
                count=count+1; //count++
            }

        }
        System.out.println(count);


        }
    }
