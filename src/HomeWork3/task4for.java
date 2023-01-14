package HomeWork3;

public class task4for {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)
        for (int j = 20; j >1; j-=2) {
            System.out.println(j);
        }
        System.out.println("--------------------------------");
        for (int i = 20; i >=1 ; i--) {
            if(i%2==0){
                System.out.println(i);
            }

        }

    }
}
