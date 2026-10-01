import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read target
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        // Find two numbers whose sum equals target
        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " " + i);
                sc.close();
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No two numbers found.");

        sc.close();
    }
}
