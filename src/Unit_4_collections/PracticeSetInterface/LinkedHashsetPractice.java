package Unit_4_collections.PracticeSetInterface;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashsetPractice {
    public static void main(String[] args) {
        // LinkedHashSet is a subclass of HashSet and implements the Set interface.
        // It maintains a doubly-linked list across all elements, preserving the insertion order.
        // Like HashSet, it does not allow duplicate elements, and operations like add, remove, and contains are performed in constant time, O(1).
        // LinkedHashSet is not synchronized, so if used in a multi-threaded environment, it needs to be synchronized externally.

        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // add(E e) - Adds the specified element to this set if it is not already present
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");

        // Duplicate elements are ignored
        linkedHashSet.add("Apple");  // This will not be added again

        // addAll(Collection<? extends E> c) - Adds all the elements in the specified collection to this set
        LinkedHashSet<String> anotherSet = new LinkedHashSet<>();
        anotherSet.add("Date");
        anotherSet.add("Elderberry");
        linkedHashSet.addAll(anotherSet);

        // contains(Object o) - Returns true if this set contains the specified element
        boolean containsApple = linkedHashSet.contains("Apple");

        // size() - Returns the number of elements in this set
        int size = linkedHashSet.size();

        // isEmpty() - Returns true if this set contains no elements
        boolean isEmpty = linkedHashSet.isEmpty();

        // remove(Object o) - Removes the specified element from this set if it is present
        linkedHashSet.remove("Banana");

        // removeAll(Collection<?> c) - Removes from this set all of its elements that are contained in the specified collection
        linkedHashSet.removeAll(anotherSet);

        // retainAll(Collection<?> c) - Retains only the elements in this set that are contained in the specified collection
        LinkedHashSet<String> fruitsToRetain = new LinkedHashSet<>();
        fruitsToRetain.add("Apple");
        linkedHashSet.retainAll(fruitsToRetain);

        // clear() - Removes all of the elements from this set
        linkedHashSet.clear();

        // Iterate over LinkedHashSet using Iterator
        // The order of iteration is the same as the order of insertion.
        linkedHashSet.add("Grape");
        linkedHashSet.add("Honeydew");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Example of other methods:

        // clone() - Returns a shallow copy of this LinkedHashSet instance
        LinkedHashSet<String> clonedSet = (LinkedHashSet<String>) linkedHashSet.clone();

        // toArray() - Returns an array containing all of the elements in this set
        Object[] array = linkedHashSet.toArray();

        // toArray(T[] a) - Returns an array containing all of the elements in this set; the runtime type of the returned array is that of the specified array
        String[] stringArray = linkedHashSet.toArray(new String[0]);

        // hashCode() - Returns the hash code value for this set
        int hashCode = linkedHashSet.hashCode();

        // equals(Object o) - Compares the specified object with this set for equality
        boolean isEqual = linkedHashSet.equals(clonedSet);

        // Print results
        System.out.println("LinkedHashSet contains 'Apple': " + containsApple);
        System.out.println("Size of LinkedHashSet: " + size);
        System.out.println("Is LinkedHashSet empty? " + isEmpty);
        System.out.println("LinkedHashSet after retainAll: " + linkedHashSet);
        System.out.println("Cloned LinkedHashSet: " + clonedSet);
        System.out.println("LinkedHashSet as array: " + java.util.Arrays.toString(array));
        System.out.println("LinkedHashSet as string array: " + java.util.Arrays.toString(stringArray));
        System.out.println("Hash code of LinkedHashSet: " + hashCode);
        System.out.println("Is LinkedHashSet equal to clonedSet? " + isEqual);
    }
}
