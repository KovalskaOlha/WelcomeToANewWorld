package If;

public class ForME {
    public static void main(String[] args) {
        boolean diploma=true;
        double gpa=1.5;
        if(diploma){
            System.out.println("Congratulation");
            if(gpa>=3.5){
                System.out.println("You are eligible to scholarship");
            }else{
                System.out.println("You should get a degree");
            }
        }else{
            System.out.println("You should have studied harder");
        }
    }
}
