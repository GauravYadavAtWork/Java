package Unit_4_collections.PracticeSetInterface;

import java.util.NavigableSet;
import java.util.TreeSet;

public class PracticeNavigableSet {
    public static void main(String[] args) {
        // NavigableSet is an interface that extends SortedSet and provides additional navigation methods.
        // TreeSet is a common implementation of NavigableSet.

        // Create a TreeSet (which implements NavigableSet)
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        // Add elements to the NavigableSet
        navigableSet.add(10);
        navigableSet.add(20);
        navigableSet.add(30);
        navigableSet.add(40);
        navigableSet.add(50);

        // ceiling(E e) - Returns the least element greater than or equal to the specified element
        Integer ceiling = navigableSet.ceiling(25); // Should be 30

        // floor(E e) - Returns the greatest element less than or equal to the specified element
        Integer floor = navigableSet.floor(25); // Should be 20

        // higher(E e) - Returns the least element strictly greater than the specified element
        Integer higher = navigableSet.higher(30); // Should be 40

        // lower(E e) - Returns the greatest element strictly less than the specified element
        Integer lower = navigableSet.lower(30); // Should be 20

        // descendingSet() - Returns a view of the set in reverse order
        NavigableSet<Integer> descendingSet = navigableSet.descendingSet();

        // subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
        NavigableSet<Integer> subSet = navigableSet.subSet(20, true, 40, false);

        // headSet(E toElement, boolean inclusive) - Returns a view of the portion of the set less than toElement
        NavigableSet<Integer> headSet = navigableSet.headSet(30, true);

        // tailSet(E fromElement, boolean inclusive) - Returns a view of the portion of the set greater than or equal to fromElement
        NavigableSet<Integer> tailSet = navigableSet.tailSet(30, false);

        // Print results
        System.out.println("NavigableSet elements: " + navigableSet);
        System.out.println("Ceiling of 25: " + ceiling);
        System.out.println("Floor of 25: " + floor);
        System.out.println("Higher than 30: " + higher);
        System.out.println("Lower than 30: " + lower);
        System.out.println("Descending Set: " + descendingSet);
        System.out.println("SubSet from 20 to 40: " + subSet);
        System.out.println("HeadSet up to 30: " + headSet);
        System.out.println("TailSet from 30: " + tailSet);
    }
}
