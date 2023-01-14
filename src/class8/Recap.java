package class8;

public class Recap {
    public static void main(String[] args) {
        //loops help us to repeat the instructions
        //10 8 6 4 2
        int i=10;
        while(i>0){
            System.out.println(i);
            i-=2;
        }

        System.out.println("__________________");
        int j=10;
        do {
            System.out.println(j);

            j-=2;
        }while(j>=2);
        System.out.println("___________________");
    }
}
