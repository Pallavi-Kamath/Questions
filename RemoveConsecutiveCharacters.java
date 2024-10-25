//Print frequency of words in a sentence
package Questions;

import java.util.Scanner;

public class RemoveConsecutiveCharacters {

    // Function to remove consecutive duplicates
    public static String removeConsecutiveDuplicates(String s) {
        // Base case: If the string is empty or has only one character, return it
        if (s.length() <= 1) {
            return s;
        }

        // Traverse the string and remove adjacent duplicates
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                // Find the position where adjacent duplicates start
                int start = i;
                // Find the position where the adjacent duplicates end
                while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
                // Remove the substring with adjacent duplicates and recursively call the function
                return removeConsecutiveDuplicates(s.substring(0, start) + s.substring(i + 1));
            }
        }

        // If no consecutive duplicates found, return the string
        return s;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // Take user input

        // Call the function to remove consecutive duplicates
        String result = removeConsecutiveDuplicates(input);

        // Output the final result
        System.out.println("Final output: " + result);
        
        // Close the scanner
        scanner.close();
    }
}
