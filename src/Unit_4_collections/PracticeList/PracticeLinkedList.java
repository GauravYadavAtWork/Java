package Unit_4_collections.PracticeList;

import java.util.LinkedList;

public class PracticeLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.addLast("Cherry");   // Add at the end
        list.addFirst("Date");    // Add at the beginning

        // Access elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 1: " + list.get(1));

        // Remove elements
        list.removeFirst();
        list.removeLast();
        list.remove("Banana");

        // Print the final list
        System.out.println("Final LinkedList: " + list);
    }
}
