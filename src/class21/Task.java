package class21;

public class Task {
    /*Create 1 class with a static method
    that has 3 overloaded forms.
    Then call each overloaded method with specific
    arguments and observe result.


*/

    static void print(){
        System.out.println("Method without arguments");
    }
    static void print(String a){
        System.out.println("Method with arguments");
    }
    static void print(int a, int b){
        System.out.println("Method with arguments int variables");
    }

    public static void main(String[] args) {
       print();
       print("Love");
       print(2,2);


    }

}
