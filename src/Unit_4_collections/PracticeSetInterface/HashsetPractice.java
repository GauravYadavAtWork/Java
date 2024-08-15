package Unit_4_collections.PracticeSetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetPractice {
    public static void main(String[] args) {
        // HashSet is part of the Java Collections Framework and implements the Set interface.
        // It is backed by a hash table (actually a HashMap instance).
        // It does not allow duplicate elements and does not maintain any order of elements.
        // HashSet allows null values and is not synchronized, making it faster than synchronized collections.
        // It provides constant time performance for basic operations like add, remove, contains, and size.

        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // add(E e) - Adds the specified element to this set if it is not already present
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Duplicate elements are ignored
        hashSet.add("Apple");  // This will not be added again

        // addAll(Collection<? extends E> c) - Adds all the elements in the specified collection to this set
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Date");
        anotherSet.add("Elderberry");
        hashSet.addAll(anotherSet);

        // contains(Object o) - Returns true if this set contains the specified element
        boolean containsApple = hashSet.contains("Apple");

        // size() - Returns the number of elements in this set
        int size = hashSet.size();

        // isEmpty() - Returns true if this set contains no elements
        boolean isEmpty = hashSet.isEmpty();

        // remove(Object o) - Removes the specified element from this set if it is present
        hashSet.remove("Banana");

        // removeAll(Collection<?> c) - Removes from this set all of its elements that are contained in the specified collection
        hashSet.removeAll(anotherSet);

        // retainAll(Collection<?> c) - Retains only the elements in this set that are contained in the specified collection
        HashSet<String> fruitsToRetain = new HashSet<>();
        fruitsToRetain.add("Apple");
        hashSet.retainAll(fruitsToRetain);

        // clear() - Removes all of the elements from this set
        hashSet.clear();

        // Iterate over HashSet using Iterator
        // Iterator provides a way to traverse through all the elements in the set
        hashSet.add("Grape");
        hashSet.add("Honeydew");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Example of other methods:

        // clone() - Returns a shallow copy of this HashSet instance
        HashSet<String> clonedSet = (HashSet<String>) hashSet.clone();

        // toArray() - Returns an array containing all of the elements in this set
        Object[] array = hashSet.toArray();

        // toArray(T[] a) - Returns an array containing all of the elements in this set; the runtime type of the returned array is that of the specified array
        String[] stringArray = hashSet.toArray(new String[0]);

        // hashCode() - Returns the hash code value for this set
        int hashCode = hashSet.hashCode();

        // equals(Object o) - Compares the specified object with this set for equality
        boolean isEqual = hashSet.equals(clonedSet);

        // Print results
        System.out.println("HashSet contains 'Apple': " + containsApple);
        System.out.println("Size of HashSet: " + size);
        System.out.println("Is HashSet empty? " + isEmpty);
        System.out.println("HashSet after retainAll: " + hashSet);
        System.out.println("Cloned HashSet: " + clonedSet);
        System.out.println("HashSet as array: " + java.util.Arrays.toString(array));
        System.out.println("HashSet as string array: " + java.util.Arrays.toString(stringArray));
        System.out.println("Hash code of HashSet: " + hashCode);
        System.out.println("Is HashSet equal to clonedSet? " + isEqual);
    }
}
