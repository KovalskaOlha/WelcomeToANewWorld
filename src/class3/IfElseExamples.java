package class3;

public class IfElseExamples {
    public static void main(String[] args) {
        char c='M';
        if(c=='M'){
            System.out.println("Male");
        }
        String name="Sam";
        /*with non-primitive data types such as String we
         can't use == symbol  We should    use .equals()
         !name.equals()



        */
        if(name.equals("Sam")){
            System.out.println("Amazing student");
        }
    }
}
