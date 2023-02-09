package If;

public class MaxLengthInString {
    public static String maxLength(String [] names){
        int size = names.length;
        String maxLength = names[0];

        for(int i = 0; i <= 3; i++){
            if(names[i].length() > maxLength.length()){
                maxLength = names[i];
            }}

        return maxLength;
    }

    public static void main(String[] args) {
        MaxLengthInString mn=new MaxLengthInString();
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }


}
