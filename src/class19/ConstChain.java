package class19;

public class ConstChain {

    ConstChain(){
        System.out.println("I'm non argument constructor");
    }

    ConstChain( String str){
        this(); // a call should be always on the first line if we want to use it
        System.out.println(str);

    }
    ConstChain(String str, int number){
        this(str);
        System.out.println("This is constructor with int parameter"+number);
    }

    public static void main(String[] args) {
        ConstChain obj=new ConstChain("hello", 20);
        System.out.println("_______End of code ___________");
    }
}
