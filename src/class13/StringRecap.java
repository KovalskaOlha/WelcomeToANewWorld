package class13;

public class StringRecap {
    public static void main(String[] args) {
        //how to print all the letters from this String one by one
        // input of charAt() method is intiger  and output char
        String str="Java is Great";
        for(int i=0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }
         int count=0;

        for(int i=0; i<str.length();i++){
            if( str.charAt(i)=='a'){
                count++;
            }
        }
            System.out.println("Letter a has appeared "+count);

    }
}
