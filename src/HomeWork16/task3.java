package HomeWork16;

public class task3 {
    /*Create a method that will accept a String as
    a parameter and return a new String that consist
    only of vowels. Method should be available inside
    the class only where it was declared and executed by
    calling it is name.*/

    private String vowStr(String given){
        String str=given.replaceAll("[^aouei]", " ");
         return str;
    }

    public static void main(String[] args) {
        task3 mt=new task3();
        System.out.println(mt.vowStr("Lalaland"));
    }

}
