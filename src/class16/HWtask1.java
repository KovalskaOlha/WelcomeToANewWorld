package class16;

public class HWtask1 {
    /*Create a method that will accept an array
     as parameters and will return a sum of all
     elements from that array.
     Method should be visibly only within same
     package and accessible by the creating an
     instance of the class. */

     int sumArrayElements(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {//for(int num:arr
            sum=sum+arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        HWtask1 rask7=new HWtask1();
        int [] arr={10,25,35,45};
        System.out.println(rask7.sumArrayElements(arr));

    }
}
