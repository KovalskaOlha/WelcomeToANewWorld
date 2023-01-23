package ProjectGroup;

public class Task9 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?

        int [] num={23,5,87,187,6,33};
        int max=num[0];
        for (int i = 1; i < num.length; i++) {
            if(num[i]>max){
                max=num[i];
            }

        }
        System.out.println("The maximum number in array is "+max);

        int min=num[0];
        for (int i = 1; i < num.length; i++) {
            if(num[i]<min){
                min=num[i];
            }

        }
        System.out.println("The minimum number in array is "+min);
    }
}
