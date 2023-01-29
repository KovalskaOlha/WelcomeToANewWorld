package HomeWork15;

public class task3 {
    //Create a method that will print whether given String is palindrome or not.

    boolean str(String given){
        String strReverse="";
        boolean answer=false;
        for ( int i=given.length()-1; i >=0; i--){
            strReverse=strReverse+given.charAt(i);
        }
        if( given.equals(strReverse)){
            answer=true;
        }
        return answer;

    }

    public static void main(String[] args) {
        task3 mth=new task3();
        System.out.println(mth.str("abba"));




    }
}
