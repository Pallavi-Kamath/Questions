package Questions;

import java.util.Scanner;

public class WordFrequency{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // First, convert to lowercase and remove non-alphabet characters
        String cleanedSentence = sentence.toLowerCase().replaceAll("[^a-zA-Z ]", "");

        // Then, split the cleaned sentence into words
        String[] words = cleanedSentence.split("\\s+");

        // Array to store the unique words
        String[] uniqueWords = new String[words.length];
        int[] wordCounts = new int[words.length];
        int uniqueIndex = 0;

        // Iterate through the words
        for (String word : words) {
            boolean found = false;
            // Check if the word is already in the uniqueWords array
            for (int i = 0; i < uniqueIndex; i++) {
                if (uniqueWords[i].equals(word)) {
                    wordCounts[i]++;
                    found = true;
                    break;
                }
            }
            // If the word is not found, add it to the uniqueWords array
            if (!found) {
                uniqueWords[uniqueIndex] = word;
                wordCounts[uniqueIndex] = 1;
                uniqueIndex++;
            }
        }

        // Print the word frequencies
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.println(uniqueWords[i] + " -> " + wordCounts[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
