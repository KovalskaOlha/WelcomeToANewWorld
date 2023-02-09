package class21;

public class Task3 {
    /*Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific
arguments and observe result.*/

    private void print(){
        System.out.println("No arguments");
    }
    private  void print(String a){
        System.out.println("String argument");
    }
    private  void print(int a){
        System.out.println("Int argument");
    }

    public static void main(String[] args) {
        Task3 st=new Task3();
        st.print();
        st.print("Love");
        st.print(22);
    }

}
