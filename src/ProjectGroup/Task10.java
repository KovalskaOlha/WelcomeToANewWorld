package ProjectGroup;

public class Task10 {
    public static void main(String[] args) {
        int [] arr ={20,1,43,89,9};
        int large=0;
        int secondLarge=0;

        for (int i = 0; i < arr.length; i++) {
            if( arr[i]>large){
                secondLarge=large;
                large=arr[i];
            }else if(arr[i]>secondLarge){
                secondLarge=arr[i];
            }

        }
        System.out.println("The second largest number in array is "+secondLarge);
    }
}
