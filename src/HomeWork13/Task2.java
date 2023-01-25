package HomeWork13;

public class Task2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters,
        // numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters
        // are there in the String.

        String str="FGHVNjhghi764789&^%$##%";
        int count=0;
        int countnum=0;
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());



        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                count++;
            }


        }
        System.out.println("The Alphabetic characters in the String are "+count);

        for (int i=0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                countnum++;
        }

        }
        System.out.println("The numeric characters in String  are "+countnum);
    }
}
