package Unit_4_collections.PracticeList;

import java.util.Stack;

public class PracticeStack {   // it is the subclass of vector class
    public static void main(String[] args) {
        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());

        // Search for an element
        int position = stack.search("Apple");
        if (position != -1) {
            System.out.println("Apple is at position: " + position);
        } else {
            System.out.println("Apple is not in the stack.");
        }

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.empty());

        // Pop the remaining elements
        while (!stack.empty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        // Final check for empty stack
        System.out.println("Is the stack empty after popping all elements? " + stack.empty());
    }
}
