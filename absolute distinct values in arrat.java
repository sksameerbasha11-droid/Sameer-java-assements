import java.util.HashSet;
import java.util.Scanner;

public class DistinctAbsoluteValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // HashSet stores only distinct values
        HashSet<Integer> set = new HashSet<>();

        // Add absolute values
        for (int i = 0; i < n; i++) {
            set.add(Math.abs(arr[i]));
        }

        // Print number of distinct absolute values
        System.out.println("Number of distinct absolute values: " + set.size());

        sc.close();
    }
}
