package class28;

import java.util.ArrayList;

public class LinkedListVSArrayList {
    public static void main(String[] args) {
        //for the LinkedList =>102 ms
        //for the ArrayList => 69675 ms
        long startTime=System.currentTimeMillis();// note the time before the code start the execution, like timer
        ArrayList<String> numbers=new ArrayList<>();
        for(int i=0; i<1000000;i++){
            numbers.add(0,"Test data");// 0 meant we want every time shift elements in between
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);


    }
}
