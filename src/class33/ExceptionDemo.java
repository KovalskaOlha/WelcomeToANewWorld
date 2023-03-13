package class33;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");
        System.out.println("Line 6");
        try {
            System.out.println(10/0);
           // String name=null;
           // System.out.println(name.length());
        }catch (NullPointerException npe){
            System.out.println("We are trying to access a method on a null object");
        }catch (ArithmeticException e){
            System.out.println("Someone is trying to divide by 0");
        }catch (Exception ex){
            System.out.println("Something went wrong");
        }

        System.out.println("Line 8");
    }
}
