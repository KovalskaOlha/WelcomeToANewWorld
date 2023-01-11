package class6;

import java.util.Scanner;

public class WhileLoopPr {
    public static void main(String[] args) {
        int i=1;
        boolean flag=true;

        while(flag){
            System.out.println(i);
            if(i>3){
                flag=false;
            }
            i++;
        }



    }
}
