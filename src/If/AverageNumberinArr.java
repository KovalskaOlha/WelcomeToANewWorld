package If;

public class AverageNumberinArr {

    final static double avgElements (int []a){
        double length=a.length;
        int sum=0;
        for( int i=0; i<a.length; i++){
            sum+=a[i];
        }return sum/length;
    }

        public static void main(String[] args) {
            int[] a = {2,7,3,8,4};
            System.out.println(avgElements(a)); //should print 4.8
        }



    }

