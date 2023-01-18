package class10;

public class EnhancedArraysDemo2 {

    //LIMITATION of ForeEach Loop
    public static void main(String[] args) {
//print only odd numbers from this array with help of normal for loop
        int [] arr={10,13,20,25,45,50};

        for (int i=0; i< arr.length; i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }

        //replace all the numbers in this array
        for (int i=0; i< arr.length; i++){
            if(arr[i]%2!=0){
                arr[i]=0;
                System.out.println(arr[i]);
            }
            System.out.println(arr[i]);
        }


    }
}
