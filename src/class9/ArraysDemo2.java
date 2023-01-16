package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // 10 20 30 45 50
        int total=0;

        int[] num={10,20,30,45,50};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            total=total+num[i];
            System.out.println(total);

        }


    }
}
