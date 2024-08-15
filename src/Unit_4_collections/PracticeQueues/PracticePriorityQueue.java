package Unit_4_collections.PracticeQueues;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PracticePriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue is a Queue implementation that orders elements based on their priority.
        // By default, it uses natural ordering or a Comparator provided at construction.

        // Create a PriorityQueue with natural ordering (min-heap by default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(3);
        minHeap.add(2);

        // Peek() - Retrieves, but does not remove, the head of the queue
        Integer head = minHeap.peek(); // Should be 1, the smallest element

        // Poll() - Retrieves and removes the head of the queue
        Integer removedHead = minHeap.poll(); // Should remove and return 1

        // Remove an element - Removes a single instance of the specified element
        minHeap.remove(3);

        // Size() - Returns the number of elements in the queue
        int size = minHeap.size();

        // IsEmpty() - Checks if the queue is empty
        boolean isEmpty = minHeap.isEmpty();

        // Clear() - Removes all elements from the queue
        // minHeap.clear(); // Uncomment to clear the queue

        // Create a PriorityQueue with a custom comparator (max-heap example)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        // Add elements to the max-heap
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(3);
        maxHeap.add(2);

        // Peek() in max-heap - Retrieves, but does not remove, the head of the queue
        Integer maxHead = maxHeap.peek(); // Should be 5, the largest element

        // Poll() in max-heap - Retrieves and removes the head of the queue
        Integer maxRemovedHead = maxHeap.poll(); // Should remove and return 5

        // Print results
        System.out.println("MinHeap:");
        System.out.println("Head: " + head);
        System.out.println("Removed Head: " + removedHead);
        System.out.println("Size of MinHeap: " + size);
        System.out.println("Is MinHeap empty? " + isEmpty);

        System.out.println("MaxHeap:");
        System.out.println("Max Head: " + maxHead);
        System.out.println("Max Removed Head: " + maxRemovedHead);
    }
}
