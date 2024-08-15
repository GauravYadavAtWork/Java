package Unit_4_collections.Learning_Maps;

import java.util.WeakHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class PracticeWeakHashmap {
    public static void main(String[] args) {
        // WeakHashMap is a Map implementation that uses weak references for keys.
        // It automatically removes entries when keys are no longer in use and are eligible for garbage collection.

        // Create a WeakHashMap
        WeakHashMap<String, Integer> map = new WeakHashMap<>();

        // Create some key objects
        String key1 = new String("Apple");
        String key2 = new String("Banana");

        // put(K key, V value) - Adds the specified key-value pair to the map
        map.put(key1, 1);
        map.put(key2, 2);

        // Key references are weak, so if we do not have any strong references to `key1`, it may be garbage collected.

        // get(Object key) - Retrieves the value associated with the specified key
        Integer valueForKey1 = map.get(key1); // Value might be null if key1 was garbage collected

        // remove(Object key) - Removes the key-value pair associated with the specified key
        map.remove(key2);

        // containsKey(Object key) - Checks if the map contains the specified key
        boolean hasKey1 = map.containsKey(key1);

        // containsValue(Object value) - Checks if the map contains the specified value
        boolean hasValue1 = map.containsValue(1);

        // size() - Returns the number of key-value pairs in the map
        int size = map.size();

        // isEmpty() - Checks if the map is empty
        boolean isEmpty = map.isEmpty();

        // clear() - Removes all key-value pairs from the map
        // map.clear(); // Uncomment to clear the map

        // keySet() - Returns a Set view of the keys contained in the map
        Set<String> keys = map.keySet();

        // values() - Returns a Collection view of the values contained in the map
        Collection<Integer> values = map.values();

        // entrySet() - Returns a Set view of the key-value pairs contained in the map
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        // Iterate over the WeakHashMap using keySet
        System.out.println("WeakHashMap elements:");
        for (String key : keys) {
            System.out.println(key + " = " + map.get(key));
        }

        // Print results
        System.out.println("Value for key1: " + valueForKey1);
        System.out.println("Map contains key1: " + hasKey1);
        System.out.println("Map contains value 1: " + hasValue1);
        System.out.println("Size of WeakHashMap: " + size);
        System.out.println("Is WeakHashMap empty? " + isEmpty);
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);
    }
}
