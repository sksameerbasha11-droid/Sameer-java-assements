import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args) {

        // Create an ArrayList to store tasks
        ArrayList<String> tasks = new ArrayList<>();

        // Add tasks
        tasks.add("Complete Java assignment");
        tasks.add("Buy groceries");
        tasks.add("Read a book");
        tasks.add("Go for a walk");

        // Display all tasks
        System.out.println("To-Do List:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }

        // Remove a task
        tasks.remove("Buy groceries");

        System.out.println("\nAfter removing a task:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }

        // Add another task
        tasks.add("Study for exam");

        // Iterate using an index
        System.out.println("\nFinal To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}
