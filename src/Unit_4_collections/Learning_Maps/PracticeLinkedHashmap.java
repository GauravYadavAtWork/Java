package Unit_4_collections.Learning_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class PracticeLinkedHashmap {
    public static void main(String[] args) {
        // HashMap is an implementation of the Map interface.
        // It uses a hash table for storing key-value pairs.
        // Keys are unique, and values can be duplicated. It allows one null key and multiple null values.
        // HashMap does not guarantee any order of the elements.

        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // put(K key, V value) - Adds the specified key-value pair to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // putIfAbsent(K key, V value) - Adds the key-value pair if the key is not already present
        map.putIfAbsent("Apple", 4); // "Apple" already exists, so value remains 1

        // get(Object key) - Retrieves the value associated with the specified key
        Integer appleCount = map.get("Apple");

        // remove(Object key) - Removes the key-value pair associated with the specified key
        map.remove("Banana");

        // containsKey(Object key) - Checks if the map contains the specified key
        boolean hasCherry = map.containsKey("Cherry");

        // containsValue(Object value) - Checks if the map contains the specified value
        boolean hasValue3 = map.containsValue(3);

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

        // Iterate over the HashMap using keySet
        System.out.println("HashMap elements:");
        for (String key : keys) {
            System.out.println(key + " = " + map.get(key));
        }

        // Print results
        System.out.println("Count of 'Apple': " + appleCount);
        System.out.println("Map contains 'Cherry': " + hasCherry);
        System.out.println("Map contains value 3: " + hasValue3);
        System.out.println("Size of HashMap: " + size);
        System.out.println("Is HashMap empty? " + isEmpty);
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);
    }
}
