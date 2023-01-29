package class15;

public class MethodPractice2 {
    //create a method that takes a string and reverse it

    String ReverseStr(String a){
        String newStr="";
        for( int i=a.length()-1; i>=0; i--){
            newStr+=a.charAt(i);
        }
        return newStr;
    }


    String ReverseStr1(String a) {
        return new StringBuilder(a).reverse().toString();

    }
}
