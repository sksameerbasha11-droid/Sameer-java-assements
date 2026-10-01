import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read radius
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        // Calculate area
        double area = Math.PI * radius * radius;

        // Display result
        System.out.println("Area of circle = " + area);

        sc.close();
    }
}
