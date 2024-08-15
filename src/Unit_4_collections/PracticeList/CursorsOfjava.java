package Unit_4_collections.PracticeList;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;

public class CursorsOfjava {
    public static void main(String[] args) {
        // Enumeration Example
        // Enumeration is an interface that provides methods to enumerate through elements in legacy collections like Vector, Stack, and Hashtable.
        // It only supports forward traversal and does not allow element removal during iteration.
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Get Enumeration object
        Enumeration<String> enumeration = vector.elements();

        // Traverse the elements using Enumeration
        System.out.println("Enumeration:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // Iterator Example
        // Iterator is an interface introduced in Java 1.2 and is a universal cursor for the Collection framework.
        // It supports both forward traversal and element removal.
        // Unlike Enumeration, Iterator is preferred for modern collections and supports fail-fast behavior, meaning it throws ConcurrentModificationException if the collection is modified during iteration.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dog");
        arrayList.add("Elephant");
        arrayList.add("Frog");

        // Get Iterator object
        Iterator<String> iterator = arrayList.iterator();

        // Traverse the elements using Iterator
        System.out.println("\nIterator:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("Elephant")) {
                iterator.remove();  // Remove the element
            }
        }

        // ListIterator Example
        // ListIterator is a specialized iterator introduced in Java 1.2 and is available only for List implementations like ArrayList, LinkedList, etc.
        // It supports both forward and backward traversal, element modification, addition, and removal during iteration.
        arrayList.add("Giraffe");
        arrayList.add("Hippo");

        // Get ListIterator object
        ListIterator<String> listIterator = arrayList.listIterator();

        // Traverse the elements using ListIterator
        System.out.println("\nListIterator (Forward Traversal):");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Traverse in reverse using ListIterator
        System.out.println("\nListIterator (Backward Traversal):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
