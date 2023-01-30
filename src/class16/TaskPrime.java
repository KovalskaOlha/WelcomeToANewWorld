package class16;

public class TaskPrime {

    boolean isPrime(int number){
        boolean flag=true;
        if(number>1){
            for(int i=2; i< number; i++){
                if(number%i==0){
                    flag=false;
                }
            }
        }else{
            flag=false;
        }
        return flag;
    }

    public static void main(String[] args) {
        TaskPrime tp=new TaskPrime();

        System.out.println(tp.isPrime(13));
    }
}
