public class Main {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, 45, 32};

        // Assume the first element is the largest
        int largest = numbers[0];

        // Compare with remaining elements
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element = " + largest);
    }
}

Output
Largest element = 45

How it works

For the array:

10  25  7  45  32


Initially, largest = 10

Compare 25 → largest becomes 25

Compare 7 → no change

Compare 45 → largest becomes 45

Compare 32 → no change

Therefore:

Largest element = 45


This uses a for loop and has a time complexity of O(n).
