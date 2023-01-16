package HomeWorkClass9;

public class task2 {
    public static void main(String[] args) {
      /*Create an array of names and store all names of your group.
       Then print your name from that array. (use 2 different ways of creating an array).*/

        String [] names={"Rafik", "Olha"," Savo", "Sezar","Slava", "Marina","Visnja", "Stefan", "Umut", "Tammr"};
        System.out.println(names[1]);
        System.out.println("******************");
        String [] ppl=new String[10];
        ppl[0]="Rafik";
        ppl[1]="Olha";
        ppl[2]="Savo";
        ppl[3]="Sezar";
        ppl[4]="Slava";
        ppl[5]="Marina";
        ppl[6]="Visnja";
        ppl[7]="Stefan";
        ppl[8]="Umut";
        ppl[9]="Tammr";
        System.out.println(ppl[1]);

    }
}
