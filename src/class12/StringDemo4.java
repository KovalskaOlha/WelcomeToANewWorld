package class12;

public class StringDemo4 {
    public static void main(String[] args) {

        String str="  ";
        boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty);// checks if the string is empty. it counts a space as well


        System.out.println(str.isBlank());
    }
}
