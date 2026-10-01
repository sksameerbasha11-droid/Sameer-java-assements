import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. length() - returns the length of the string
        System.out.println("Length: " + str.length());

        // 2. toUpperCase() - converts string to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. charAt() - returns character at a specified index
        System.out.println("First character: " + str.charAt(0));

        sc.close();
    }
}
