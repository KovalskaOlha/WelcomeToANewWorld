package HomeWork28;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String>cars=new ArrayList<>();
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Porsche");
        cars.add("Lexus");
        cars.add("Range Rover");
         //1
        System.out.println(cars);
        //2
        for(String car:cars){
            System.out.println(car);
        }
        //3
        for(int i=0; i< cars.size();i++)
            System.out.println(cars.get(i));

    }
}
