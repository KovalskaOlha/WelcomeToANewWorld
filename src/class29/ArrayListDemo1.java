package class29;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //Dog d1=new Dog("Jacky","persian",15);
        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Jacky","persian",15));
        dogs.add(new Dog("JAmi","german",5));
        dogs.add(new Dog("Jimmi","bulldog",1));
        dogs.add(new Dog("mami","unknown",10));

        for(Dog d:dogs){
            d.printDogName();
        }
    }
}
