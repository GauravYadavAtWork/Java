package Unit_4_collections.Learning_Maps;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class PractiseHashTable {
    public static void main(String[] args) {
        // Hashtable is a legacy class that implements the Map interface and is synchronized.
        // It is thread-safe but does not allow null keys or values.

        // Create a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // put(K key, V value) - Inserts the specified key-value pair into the hashtable
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Cherry", 3);

        // get(Object key) - Retrieves the value associated with the specified key
        Integer valueForApple = hashtable.get("Apple");

        // remove(Object key) - Removes the key-value pair associated with the specified key
        hashtable.remove("Banana");

        // containsKey(Object key) - Checks if the hashtable contains the specified key
        boolean hasCherry = hashtable.containsKey("Cherry");

        // containsValue(Object value) - Checks if the hashtable contains the specified value
        boolean hasValue1 = hashtable.containsValue(1);

        // size() - Returns the number of key-value pairs in the hashtable
        int size = hashtable.size();

        // isEmpty() - Checks if the hashtable is empty
        boolean isEmpty = hashtable.isEmpty();

        // clear() - Removes all key-value pairs from the hashtable
        // hashtable.clear(); // Uncomment to clear the hashtable

        // keySet() - Returns a Set view of the keys contained in the hashtable
        Set<String> keys = hashtable.keySet();

        // values() - Returns a Collection view of the values contained in the hashtable
        Collection<Integer> values = hashtable.values();

        // entrySet() - Returns a Set view of the key-value pairs contained in the hashtable
        Set<Map.Entry<String, Integer>> entries = hashtable.entrySet();

        // Iterate over the Hashtable using keySet
        System.out.println("Hashtable elements:");
        for (String key : keys) {
            System.out.println(key + " = " + hashtable.get(key));
        }

        // Print results
        System.out.println("Value for Apple: " + valueForApple);
        System.out.println("Hashtable contains Cherry: " + hasCherry);
        System.out.println("Hashtable contains value 1: " + hasValue1);
        System.out.println("Size of Hashtable: " + size);
        System.out.println("Is Hashtable empty? " + isEmpty);
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);
    }
}
