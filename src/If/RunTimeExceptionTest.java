package If;

public class RunTimeExceptionTest {
    public static void tempCheck(double temp){
        if(temp<32.0){
            throw new RuntimeException("It is freezing");
        }
    }
    public static void main(String[] args) {
        try{
            double temp=31.0;
            tempCheck(temp);
        }catch(RuntimeException re){
            System.out.println(re.getClass()+" "+re.getMessage());
        }
    }
}
