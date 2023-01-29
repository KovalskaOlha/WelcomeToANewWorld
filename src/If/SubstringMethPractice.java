package If;

public class SubstringMethPractice {
    public static void main(String[] args) {
        String str="I love you, World. What's going on?";
        System.out.println(str.substring(3,6));

        String [] arr=str.split("[.]");
        System.out.println(arr.length);
        System.out.println(arr[1].trim());

        String a="HaPPy to mEET you";
        String b=a.toUpperCase();
        System.out.println(b);

    }
}
