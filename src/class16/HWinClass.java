package class16;

public class HWinClass {
    //Create a method that will print whether given
    // String is palindrome or not.
    //return type=>void

    void isPalindrome(String str){

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversed= st.toString();
        if(str.equals(reversed)){
            System.out.println(reversed+" is palindrome");
        }else{
            System.out.println(reversed+" is not palindrome");
        }
    }

    public static void main(String[] args) {

        HWinClass mth=new HWinClass(); // object of the class
        mth.isPalindrome("manana"); //method
       // System.out.println(mth.isPalindrome("manana"));  we cant use void method in Println

    }


}
