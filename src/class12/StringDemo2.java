package class12;

public class StringDemo2 {
    public static void main(String[] args) {

        String str="JAVA is FUN";
        // toLowerCase a method  convert all uppercase in lowercase
        //there is no input in this method and the output is another string
        String newStr=str.toLowerCase();
        System.out.println(newStr);

        String str2="i love java";
        String upperCaseLetters=str2.toUpperCase();
        System.out.println(upperCaseLetters);

    }
}
