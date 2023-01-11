package HomeWork3;

public class task5 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)
        int i=20;
        while (i<50){
            if(i%2!=0){
                System.out.println(i);
            } i++;
        }
        System.out.println("-------------------------------");

        int i1=21;
        while(i1<50){
            System.out.println(i1);
            i1+=2;
        }


    }
}
