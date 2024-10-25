//Print all permutations of a string “TJS”
package Questions;

public class Recursive {
    
    // Recursive method to generate and print all permutations
    public static void generatePermutations(String str, String permutation) {
        // Base case: if the input string is empty, we have a complete permutation
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }

        // Loop through the string, generating permutations by removing one character at a time
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char currentChar = str.charAt(i);

            // Form the remaining string by excluding the current character
            String remainingString = str.substring(0, i) + str.substring(i + 1);

            // Recurse with the remaining string and append the current character to the permutation
            generatePermutations(remainingString, permutation + currentChar);
        }
    }

    public static void main(String[] args) {
        String str = "TJS";  // Input string

        System.out.println("Permutations of the string " + str + ":");
        generatePermutations(str, "");  // Initial call with empty permutation
    }
}
