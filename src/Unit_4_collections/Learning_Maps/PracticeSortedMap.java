package Unit_4_collections.Learning_Maps;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class PracticeSortedMap {
    public static void main(String[] args) {
        // SortedMap is an interface that maintains keys in sorted order.
        // TreeMap is a common implementation of SortedMap.

        // Create a TreeMap (which is an implementation of SortedMap)
        SortedMap<String, Integer> map = new TreeMap<>();

        // put(K key, V value) - Adds the specified key-value pair to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // firstKey() - Returns the first (lowest) key in the map
        String firstKey = map.firstKey();

        // lastKey() - Returns the last (highest) key in the map
        String lastKey = map.lastKey();

        // headMap(K toKey) - Returns a view of the portion of the map whose keys are strictly less than toKey
        SortedMap<String, Integer> headMap = map.headMap("Cherry");

        // tailMap(K fromKey) - Returns a view of the portion of the map whose keys are greater than or equal to fromKey
        SortedMap<String, Integer> tailMap = map.tailMap("Banana");

        // subMap(K fromKey, K toKey) - Returns a view of the portion of the map whose keys range from fromKey (inclusive) to toKey (exclusive)
        SortedMap<String, Integer> subMap = map.subMap("Banana", "Cherry");

        // comparator() - Returns the comparator used to sort the map
        // For TreeMap, this will be null as it uses natural ordering
        java.util.Comparator<? super String> comparator = map.comparator();

        // keySet() - Returns a Set view of the keys contained in the map
        Set<String> keys = map.keySet();

        // values() - Returns a Collection view of the values contained in the map
        Collection<Integer> values = map.values();

        // entrySet() - Returns a Set view of the key-value pairs contained in the map
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        // Iterate over the SortedMap using keySet
        System.out.println("SortedMap elements:");
        for (String key : keys) {
            System.out.println(key + " = " + map.get(key));
        }

        // Print results
        System.out.println("First key: " + firstKey);
        System.out.println("Last key: " + lastKey);
        System.out.println("HeadMap: " + headMap);
        System.out.println("TailMap: " + tailMap);
        System.out.println("SubMap: " + subMap);
        System.out.println("Comparator: " + comparator);
        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);
        System.out.println("Entries: " + entries);
    }
}
