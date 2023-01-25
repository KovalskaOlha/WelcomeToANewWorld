package class13;

public class StringReplaceDemo {
    public static void main(String[] args) {
        String str=" KJGY876iujnj36778*&%$";
        // replace uppercase letters [rangeA-Z]
        System.out.println(str.replaceAll("[A-Z]","#"));
        // replace lower case letters [a-z]
        System.out.println(str.replaceAll("[a-z]","#"));
        // replace all numbers
        System.out.println(str.replaceAll("[0-9]","#"));
        //replace all letters lowercase and uppercase
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        //replace letters and numbers
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        // ^ NOT symbol in String replace method replace all symbols
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
          // if we want to remove smth we need just not specify the replacement ""
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));

    }
}
