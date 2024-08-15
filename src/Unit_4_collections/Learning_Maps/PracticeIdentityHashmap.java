package Unit_4_collections.Learning_Maps;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class PracticeIdentityHashmap {
    public static void main(String[] args) {
        // IdentityHashMap is a Map implementation that uses reference equality (==) for key comparisons.
        // It is similar to HashMap but considers two keys equal only if they are the same object.

        // Create an IdentityHashMap
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();

        // Create some key objects
        String key1 = new String("Apple");
        String key2 = new String("Apple");
        String key3 = new String("Banana");

        // put(K key, V value) - Adds the specified key-value pair to the map
        map.put(key1, 1);
        map.put(key2, 2); // key2 is different object but same content as key1

        // get(Object key) - Retrieves the value associated with the specified key
        Integer valueForKey1 = map.get(key1);

        // remove(Object key) - Removes the key-value pair associated with the specified key
        map.remove(key3); // key3 does not exist in the map

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

        // Iterate over the IdentityHashMap using keySet
        System.out.println("IdentityHashMap elements:");
        for (String key : keys) {
            System.out.println(key + " = " + map.get(key));
        }

        // Print results
        System.out.println("Value for key1: " + valueForKey1);
        System.out.println("Map contains key1: " + hasKey1);
        System.out.println("Map contains value 1: " + hasValue1);
        System.out.println("Size of IdentityHashMap: " + size);
        System.out.println("Is IdentityHashMap empty? " + isEmpty);
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);
    }
}
