package HomeWork16;

public class task2 {
    /*Create a method that will take a String as a parameter
    and returns reversed String. Method should be available
    to all classes within your project and accessible by class name.*/

   public String a(String b){
       //return new StringBuilder(String b).reverse().toString();
        StringBuilder st=new StringBuilder(b);
        st.reverse();
        String reversed=st.toString();
        return reversed;
    }

    public static void main(String[] args) {
        task2 ts=new task2();
        System.out.println(ts.a("Syntax"));

    }
}
