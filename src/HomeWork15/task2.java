package HomeWork15;

public class task2 {
    //Create a method that will take a number and prints whether the number is even or odd.

    int EvenOrOdd(int a){
        boolean flag;
        if(a%2==0){
            flag=true;
            System.out.println("Given number is even");
        }else{
            flag=false;
            System.out.println("Given number is odd");
        }
        return a;

    }

    public static void main(String[] args) {
        task2 mth=new task2();
        System.out.println(mth.EvenOrOdd(6));
    }
}
