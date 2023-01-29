package HomeWork15;

public class task1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    int largerNumber(int a,int b){
        if( a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        task1 ln=new task1();
        System.out.println(ln.largerNumber(8,2));
    }
}
