package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NegativePositiveRearrange 
{
    public static void rearrangeNegativePositive(int[] arr) 
    {
        var negativeList = new ArrayList<Integer>();
        var positiveList = new ArrayList<Integer>();
        
        // Separate negative and positive numbers
        for (int num : arr) 
        {
            if (num < 0) 
            {
                negativeList.add(num);
            } else 
            {
                positiveList.add(num);
            }
        }
        
        // Sort both negative and positive lists
        Collections.sort(negativeList);  // Sort negative numbers
        Collections.sort(positiveList);  // Sort positive numbers
        
        // Combine negative numbers first, then positive numbers
        int index = 0;
        
        // Add sorted negative elements to the original array
        for (int i = 0; i < negativeList.size(); i++) 
        {
            arr[index++] = negativeList.get(i);
        }
        
        // Add sorted positive elements to the original array
        for (int i = 0; i < positiveList.size(); i++) {
            arr[index++] = positiveList.get(i);
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        // Take input for the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the function to rearrange and sort the array
        rearrangeNegativePositive(arr);
        
        // Print the rearranged and sorted array
        System.out.println("Rearranged and sorted array (negative elements first):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        // Close the scanner
        scanner.close();
    }
}
