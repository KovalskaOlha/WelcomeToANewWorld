package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo3 {
    /*Create a map of a building.
    Store floor number and it is associated
    company name. (Example: 1= Google, 2=Syntax etc..).
    Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
*/
    public static void main(String[] args) {
        Map<Integer,String> building=new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(2,"Syntax");
        building.put(4,"Tesla");
        building.put(5,"Facebook");
        building.put(6,"Bank of America");
        building.put(7,"BMW inc.");

        System.out.println(building.size());
        building.replace(4,"New Value");
        building.remove(7);
        System.out.println(building);
    }
}
