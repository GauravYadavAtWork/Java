package Unit_4_collections.PracticeList;

import java.util.Vector;

public class PracticeVector {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.addElement("Cherry"); // Add using legacy method
        vector.insertElementAt("Date", 1); // Insert at index 1

        // Access elements
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
        System.out.println("Element at index 2: " + vector.get(2));

        // Remove elements
        vector.removeElementAt(1); // Remove element at index 1
        vector.remove("Banana");

        // Print the final vector
        System.out.println("Final Vector: " + vector);

        // Capacity and size
        System.out.println("Current size: " + vector.size());
        System.out.println("Current capacity: " + vector.capacity());
    }
}
