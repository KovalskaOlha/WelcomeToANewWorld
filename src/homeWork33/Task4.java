package homeWork33;

public class Task4 {
    /*Create a method checkUserName that will throw a runtime exception.
     Method should throw an exception when entered username is less than 5 characters.*/
    public static void checkUserName(String name){
        if(name.length()<5){
            throw new RuntimeException("Your name is too short");
        }
    }

    public static void main(String[] args) {

        String name="Alex";
        try{
            checkUserName(name);
        }catch (RuntimeException e){
            System.out.println("Sorry... "+e.getMessage());
        }

    }
}
