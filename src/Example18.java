import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Example18 {
    public static void main(String[] args) {
        final ArrayList<String> list = new ArrayList<String>();
        list.add("Hasan");
        list.add("Mohammed");
        list.add("Salem");
        list.add("Hamed");
        list.add("Saleh");

        System.out.println(list);
        System.out.println("----------------------------------------");
        System.out.println(list.get(4));
        System.out.println("----------------------------------------");
        list.set(1, "Fatima");
        System.out.println(list);
        System.out.println("----------------------------------------");
        list.remove(2);
        System.out.println(list);
        System.out.println("----------------------------------------");
        System.out.println(list.size());
        System.out.println("----------------------------------------");


        final ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(15);
        intList.add(10);
        intList.add(25);
        intList.add(20);
        System.out.println(intList);

        // Using class collections to sort an array
        Collections.sort(intList);
        for (int i : intList) {
            System.out.println(i);

        }
    }
}
