package class10;

public class ArrayDemo1 {
    public static void main(String[] args) {
        /* Arrays allow us to store multiple values in a single veriable.
        we use indexes to get back the values. Why we should learn Arrays:
        if we have to store a lot of values it becomes hard to manage a lot of variables
        Syntax:
      1)  datatype [] name={element1, element2, element3...};
       sout(name[number of index]);

     2)  datatype[] name=new datatype[size of arrays, numbers of indexes];



       */

        int [] numbers={10,20,30,40,50};
        System.out.println(numbers[4]);
        //if we want to print 2 or more numbers from the arrays
        System.out.println(numbers[1]+" "+numbers[2]);

        System.out.println("_________________");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println("______________");
        //Enhanced for loop   //foreach for loop
        //when ever possible use below loop
        for (int x:numbers){
            System.out.println(x);
        }

    }
}
