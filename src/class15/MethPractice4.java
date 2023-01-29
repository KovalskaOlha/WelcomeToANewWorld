package class15;

public class MethPractice4 {
    /*create a method that takes two numbers as parameters and return the larger
    * number*/

    int Larger(int a, int b){
        if( a>b){
            return a;
        }else {
            return b;
        }


    }

    public static void main(String[] args) {
        MethPractice4 mp=new MethPractice4();
        System.out.println(mp.Larger(7,2));
    }
}
