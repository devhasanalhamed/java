import java.util.LinkedList;

public class Example19 {
//    Linked list
    /*
    Is similar to the arraylist but, they are built different
    array list do replace the old list with new one while adding
    new element, but linked list store element as containers that
    leads to the next element
     */


    public static void main(String[] args) {
        final LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("Hello");
        linkedList.add("World!");
        
        System.out.println(linkedList);
    }
}
