package HomeWork13;

public class task6 {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?

        String str1="Happy";
        String str2="girl";

        System.out.println("Strings before swap are "+str1+" and "+str2);

        str1=str1+str2;
        str2=str1.substring(0, str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println("Strings after swap are "+str1+" and "+str2);
    }
}
