package class9;

public class ArraysDemo7Task {
    public static void main(String[] args) {

        //multiply even INDEX in arrays

        int []numbers=new int[5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            if(i%2==0) {
                sum=sum+numbers[i];
            }

        }
        System.out.println(sum);

        System.out.println("__________________-");


        //add all element which are multiple of 2


        int [] arr={10,20,30,4,5,6,7,80};
        int total=0;

        for (int j = 0; j < arr.length; j++) {

            if(arr[j]%2==0){
                total=total+arr[j];

            }

        }
        System.out.println(total);



        }
    }
