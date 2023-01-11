package class2;

public class Variables {
    public static void main(String[] args) {
        int box1=10;
        System.out.println(box1); // bring the content
        System.out.println("box1");// bring the text not the value

        /* to store whole numbers ( numbers without decimals points)
        we have  4 different types of boxes
        for example numbers like 10  20  30  33000
        1) byte( -128...127)
        2) short
        3) int
        4) long
        */
        byte box2=127;
        byte box3=-128;
        short box4=32767;
        short box5=-32767;
        int biggerBox= 23567836; // most common type of box
        long maxBox= 2563866567676l;// we need to put l at the end of our big number
       short myBox = 10000;
        System.out.println(myBox);
    }
}
