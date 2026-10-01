import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of strings
        int n = sc.nextInt();

        // HashMap to store anagram groups
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            // Convert string to character array
            char[] chars = str.toCharArray();

            // Sort the characters
            Arrays.sort(chars);

            // Convert sorted characters back to String
            String key = new String(chars);

            // Count the anagram group
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // Count number of anagram groups
        int groups = 0;

        for (int count : map.values()) {
            if (count > 1) {
                groups++;
            }
        }

        System.out.println("Number of anagram groups: " + groups);

        sc.close();
    }
}
