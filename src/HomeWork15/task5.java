package HomeWork15;

public class task5 {
    //Write a method to return whether given number is prime or not?

    boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        task5 mth=new task5();
        System.out.println(mth.isPrime(3));
    }
}
