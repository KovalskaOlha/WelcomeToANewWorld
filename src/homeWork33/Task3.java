package homeWork33;

public class Task3 {
    /*Create a method to check age eligibility
    that will throw a runtime exception.
    Method should throw an exception age is less than 16.*/
    public static void main(String[] args){
        int age = 11;
        try{
            checkAge(age);
            System.out.println("You are eligible!");
        }catch (RuntimeException e){
            System.out.println("You are not eligible : "+e.getMessage());
        }


    }
    public static void checkAge(int age){
        if(age<16){
            throw new RuntimeException("Age is less than 16 ");
        }
    }
}
