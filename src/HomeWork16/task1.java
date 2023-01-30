package HomeWork16;

public class task1 {
    /*Create a method that will accept an array as parameters and will
    return a sum of all elements from that array. Method should be visibly only
    within same package and accessible by the creating an instance of the class. */

    int sum(int []arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        task1 ts=new task1();
        int [] arr={12,32,32,22};
        System.out.println(ts.sum(arr));
    }

}
