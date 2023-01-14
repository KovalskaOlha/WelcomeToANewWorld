package class8;

public class continueKeyword {
    public static void main(String[] args) {

        // continue and break exist ONLY with IF CONDITION

        for (int i = 0; i < 10; i++) {

            if(i%3==0){
                continue;  //skip inside the bode of code
            }else{
                System.out.println(i);

            }
            System.out.println("hello java");

        }
    }
}
