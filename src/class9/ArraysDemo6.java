package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 45;
        numbers[1] = 44;
        numbers[2] = 33;
        numbers[3] = 20;
        numbers[4] = 10;
        int total = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                total=total+(numbers[i]);
                }
            }
        System.out.println(total);

        int[] num={10,20,30,4,5,6,7,80};
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) ;
            {
                sum = sum + (num[i]);

            }

        }
        System.out.println(sum);
        }
    }
