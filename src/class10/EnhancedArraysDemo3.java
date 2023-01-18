package class10;

public class EnhancedArraysDemo3 {

    //LIMITATION of ForeEach Loop
    public static void main(String[] args) {

        int [] arr={10,13,20,25,45,50};
        //We can't update the elements in for each loop because we dont have access to the index
        for (int x:arr) {
            if(x%2!=0){
               // x=0;// Java does not know the index of x
                System.out.println(x);
                //output nothing

            }

        }




    }
}
