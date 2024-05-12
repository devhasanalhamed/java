import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Example20 {
//    HashMap
    /*
    They are similar to maps in dart, storing key and value
     */

//    HashSet
    /*
    On the other hand this is like a unique list in dart
     */

    public static void main(String[] args) {
        final HashMap<String, Integer> nameAgeHashMap = new HashMap<String, Integer>();

        nameAgeHashMap.put("Hasan", 21);
        nameAgeHashMap.put("Saleh", 8);
        nameAgeHashMap.put("Mohammed", 29);

        System.out.println(nameAgeHashMap);
        System.out.println(nameAgeHashMap.get("Saleh"));


        final HashSet<Integer> intSet = new HashSet<Integer>();
        intSet.add(8);
        intSet.add(16);
        intSet.add(32);
        intSet.add(24);

        final ArrayList<Integer> intList = new ArrayList<>(intSet);
        Collections.sort(intList);

        System.out.println(intList);

    }
}
