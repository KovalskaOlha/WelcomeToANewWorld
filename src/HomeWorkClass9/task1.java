package HomeWorkClass9;

public class task1 {
    public static void main(String[] args) {
        /*Create an array of chars and store grades into it: A,B,C,D,E,F.
        Then print a grade B (use 2 different ways of creating an array).*/
        char[] arr={'A','B','C','D','E','F'};
        System.out.println(arr[1]);
        System.out.println("*******************");
        char[] letters=new char[6];
        letters[0]='A';
        letters[1]='B';
        letters[2]='C';
        letters[3]='D';
        letters[4]='E';
        letters[5]='F';
        System.out.println(letters[1]);
    }
}
