package HomeWork19;

public class TeacherTest {
    public static void main(String[] args) {
       Teacher t=new Teacher();
       t.beAngry();
       t.beHappy();
       //t.speakLoud(); private
       t.speakQuiet();

       t.name="Sarah";
       t.age=36;

       MathTeacher mt=new MathTeacher();
       mt.name="Nicol";
       mt.age=23;
       mt.count();
       mt.loveMath();
       mt.beAngry();
      // mt.speakLoud();// private
       mt.beHappy();
       mt.beAngry();
       mt.speakQuiet();

       ChemistryTeacher ct=new ChemistryTeacher();
       ct.loveChemistry();
       ct.molecule();
       ct.beAngry();
       ct.speakQuiet();

       PianoTeacher pt=new PianoTeacher();
       pt.loveMusic();
       pt.play();
       pt.speakQuiet();
       pt.beHappy();
    }
}
