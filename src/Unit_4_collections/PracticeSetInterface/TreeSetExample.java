package Unit_4_collections.PracticeSetInterface;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {
        // TreeSet is a NavigableSet that implements the SortedSet interface.
        // It maintains elements in a sorted order using a Red-Black tree.
        // It does not allow duplicate elements and is not synchronized.
        // It provides efficient methods for sorted data navigation.

        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // add(E e) - Adds the specified element to this set if it is not already present
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");

        // Duplicate elements are ignored
        treeSet.add("Apple");  // This will not be added again

        // first() - Returns the first (lowest) element in this set
        String firstElement = treeSet.first();

        // last() - Returns the last (highest) element in this set
        String lastElement = treeSet.last();

        // headSet(E toElement) - Returns a view of the portion of this set whose elements are strictly less than toElement
        TreeSet<String> headSet = (TreeSet<String>) treeSet.headSet("Cherry");

        // tailSet(E fromElement) - Returns a view of the portion of this set whose elements are greater than or equal to fromElement
        TreeSet<String> tailSet = (TreeSet<String>) treeSet.tailSet("Banana");

        // subSet(E fromElement, E toElement) - Returns a view of the portion of this set between fromElement (inclusive) and toElement (exclusive)
        TreeSet<String> subSet = (TreeSet<String>) treeSet.subSet("Banana", "Cherry");

        // ceiling(E e) - Returns the least element greater than or equal to e, or null if no such element
        String ceiling = treeSet.ceiling("Banana");

        // floor(E e) - Returns the greatest element less than or equal to e, or null if no such element
        String floor = treeSet.floor("Banana");

        // higher(E e) - Returns the least element strictly greater than e, or null if no such element
        String higher = treeSet.higher("Banana");

        // lower(E e) - Returns the greatest element strictly less than e, or null if no such element
        String lower = treeSet.lower("Banana");

        // clear() - Removes all of the elements from this set
        // treeSet.clear(); // Uncomment to clear the set

        // Iterate over TreeSet using enhanced for-loop
        System.out.println("TreeSet elements:");
        for (String element : treeSet) {
            System.out.println(element);
        }

        // Print results
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
        System.out.println("HeadSet (elements < 'Cherry'): " + headSet);
        System.out.println("TailSet (elements >= 'Banana'): " + tailSet);
        System.out.println("SubSet (elements from 'Banana' to 'Cherry'): " + subSet);
        System.out.println("Ceiling of 'Banana': " + ceiling);
        System.out.println("Floor of 'Banana': " + floor);
        System.out.println("Higher than 'Banana': " + higher);
        System.out.println("Lower than 'Banana': " + lower);
    }
}
