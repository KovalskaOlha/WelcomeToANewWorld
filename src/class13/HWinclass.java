package class13;

public class HWinclass {
    public static void main(String[] args) {
        String str="Sunday";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));// same order

            //HOW TO REVERSE THE STRING

            for (int j = 5; j >=0 ; j--) {// or( int j=str.length()-1;
                System.out.println(str.charAt(j));

            }

            //for (int i = str.length()-1; i>=0; i--) {
            //    System.out.print(str.charAt(i));
            //      sunday===>>>yadnus
            //}

        }
    }
}
