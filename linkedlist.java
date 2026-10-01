import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Grapes");

        System.out.println("Original LinkedList: " + list);

        // Accessing elements

        // Access first element
        System.out.println("First element: " + list.getFirst());

        // Access last element
        System.out.println("Last element: " + list.getLast());

        // Access element using index
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements

        // Remove first element
        list.removeFirst();
        System.out.println("After removing first: " + list);

        // Remove last element
        list.removeLast();
        System.out.println("After removing last: " + list);

        // Remove element using index
        list.remove(1);
        System.out.println("After removing index 1: " + list);

        // Remove element using value
        list.remove("Mango");
        System.out.println("After removing Mango: " + list);
    }
}

Output
Original LinkedList: [Apple, Banana, Mango, Orange, Grapes]
First element: Apple
Last element: Grapes
Element at index 2: Mango
After removing first: [Banana, Mango, Orange, Grapes]
After removing last: [Banana, Mango, Orange]
After removing index 1: [Banana, Orange]
After removing Mango: [Banana, Orange]

Important LinkedList operations
Operation	Method	Purpose
Access first	getFirst()	Gets first element
Access last	getLast()	Gets last element
Access by index	get(index)	Gets element at a position
Remove first	removeFirst()	Removes first element
Remove last	removeLast()	Removes last element
Remove by index	remove(index)	Removes element at a position
Remove by value	remove(value)	Removes a particular element

The important point is that LinkedList is part of Java's Collections Framework, so you can use these predefined operations instead of manually manipulating nodes.
