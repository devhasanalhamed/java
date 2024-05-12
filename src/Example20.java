import java.util.ArrayList;
import java.util.Iterator;

public class Example20 {
//    Iterator
    /*
    An Iterator is an object that can be used to loop through
    collections, like ArrayList and HashSet. It is called an
    "iterator" because "iterating" is the technical term for looping.
     */

    public static void main(String[] args) {
        final ArrayList<Integer> intList = new ArrayList<>();

        intList.add(8);
        intList.add(16);
        intList.add(32);
        intList.add(24);

        System.out.println(intList);

        Iterator<Integer> intIterator = intList.iterator();

        while (intIterator.hasNext()) {
            int i = intIterator.next();
            if (i == 8) {
                System.out.println("Ture");
                intIterator.remove();
            }
        }
        System.out.println(intList);
    }
}
