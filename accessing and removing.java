import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> tasks = new LinkedList<>();

        // Add elements
        tasks.add("Study Java");
        tasks.add("Complete assignment");
        tasks.add("Read a book");
        tasks.add("Go for a walk");

        System.out.println("Original LinkedList:");
        System.out.println(tasks);

        // Accessing elements
        System.out.println("\nFirst task: " + tasks.getFirst());
        System.out.println("Last task: " + tasks.getLast());
        System.out.println("Task at index 1: " + tasks.get(1));

        // Removing elements
        tasks.removeFirst();       // Removes the first element
        tasks.removeLast();        // Removes the last element
        tasks.remove("Read a book"); // Removes a specific element

        System.out.println("\nLinkedList after removing elements:");
        System.out.println(tasks);

        // Remove element by index
        tasks.remove(0);

        System.out.println("\nAfter removing element at index 0:");
        System.out.println(tasks);
    }
}
