package If;

public class MaxValueInArray {
    static int maxValue(int [] a){
        int maxValue=a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] > maxValue)
                maxValue = a[i];

        } return maxValue;

    }



    public static void main(String[] args) {
        MaxValueInArray mn=new MaxValueInArray();
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr));
        //should print 22
    }



}
