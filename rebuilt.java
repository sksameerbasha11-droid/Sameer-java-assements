import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split(" ");

        // Display individual words
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Rebuild sentence in new format
        StringBuilder newSentence = new StringBuilder();

        for (String word : words) {
            newSentence.append(word).append("-");
        }

        // Remove the last "-"
        newSentence.deleteCharAt(newSentence.length() - 1);

        System.out.println("New format: " + newSentence);

        sc.close();
    }
}
