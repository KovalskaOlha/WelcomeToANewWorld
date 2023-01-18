package class10;

import java.util.Arrays;

public class TwoDArraysDemo {
    public static void main(String[] args) {
        /* a 2D arrays which can hold 3 one D arrays each of size 3  */
        String [][] thomsontrain=new String[3][];// or [3][3]
        String [] cabin0={"Adam","Zafar","Sam"};
        String [] cabin1={"Nabi","Saud","Anees"};
        String [] cabin2={"Safi","Abeera","Zahra"};


        thomsontrain[0]=cabin0;
        thomsontrain[1]=cabin1;
        thomsontrain[2]=cabin2;

        //in the first [] we specify the address of 1 D ARRAY
        //
        System.out.println(thomsontrain[1][2]);// Anees
        System.out.println(Arrays.toString(thomsontrain[0]));
    }
}
