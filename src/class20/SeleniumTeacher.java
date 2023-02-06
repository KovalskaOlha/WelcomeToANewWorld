package class20;

import HomeWork19.Teacher;

public class SeleniumTeacher extends Teacher {

    public static void main(String[] args) {
        SeleniumTeacher al=new SeleniumTeacher();

        al.beAngry();
        al.speakQuiet();// protected
        //al.beHappy(); default
    }
}
