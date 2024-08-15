package Unit_4_collections.PracticeSetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        // TreeSet is a common implementation of SortedSet.
        // It maintains elements in a sorted order (natural ordering or according to a specified comparator).
        // TreeSet is not synchronized and does not allow null elements.

        // Create a TreeSet (SortedSet implementation)
        SortedSet<String> sortedSet = new TreeSet<>();

        // add(E e) - Adds the specified element to this set if it is not already present
        sortedSet.add("Apple");
        sortedSet.add("Banana");
        sortedSet.add("Cherry");

        // Duplicate elements are ignored
        sortedSet.add("Apple");  // This will not be added again

        // first() - Returns the first (lowest) element in this set
        String firstElement = sortedSet.first();

        // last() - Returns the last (highest) element in this set
        String lastElement = sortedSet.last();

        // headSet(E toElement) - Returns a view of the portion of this set whose elements are strictly less than toElement
        SortedSet<String> headSet = sortedSet.headSet("Cherry");

        // tailSet(E fromElement) - Returns a view of the portion of this set whose elements are greater than or equal to fromElement
        SortedSet<String> tailSet = sortedSet.tailSet("Banana");

        // subSet(E fromElement, E toElement) - Returns a view of the portion of this set between fromElement (inclusive) and toElement (exclusive)
        SortedSet<String> subSet = sortedSet.subSet("Banana", "Cherry");

        // clear() - Removes all of the elements from this set
        // sortedSet.clear(); // Uncomment to clear the set

        // Iterate over SortedSet using enhanced for-loop
        System.out.println("SortedSet elements:");
        for (String element : sortedSet) {
            System.out.println(element);
        }

        // Print results
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        System.out.println("HeadSet (elements < 'Cherry'): " + headSet);
        System.out.println("TailSet (elements >= 'Banana'): " + tailSet);
        System.out.println("SubSet (elements from 'Banana' to 'Cherry'): " + subSet);
    }
}
