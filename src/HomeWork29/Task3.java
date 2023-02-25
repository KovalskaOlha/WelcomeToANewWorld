package HomeWork29;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Task3 {
    /*Create a Set collection that will hold Objects of Student Type.
     In this set we do not care about the insertion order.
     Each student object should have name and studentID.
      Display name of each student.*/
    public static void main(String[] args) {
        HashMap<String,String> st=new HashMap<>();
        st.put("Katy","I123123");
        st.put("Sam","A22331");
        st.put("Tomy","B787878");
        st.put("Tiffany","T54343");
        st.put("Jenny","Q223322");
        System.out.println(st.keySet());


    }
}
