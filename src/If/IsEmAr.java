package If;

import java.util.ArrayList;
import java.util.LinkedList;

public class IsEmAr {
    public static void main(String[] args) {


        LinkedList<String> myList = new LinkedList<>();
        myList.add("hi");
        myList.add("yo");
        myList.add("sup");
        myList.add("yolo");
        myList.add("boop");
        System.out.println(myList);
        System.out.println(myList.size());

        myList.remove(String.valueOf(1));
        System.out.println(myList);





    }
}
