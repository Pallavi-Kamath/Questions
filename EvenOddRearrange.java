//Given an array, rearrange the elements in the array such that all 
//even elements come first in array and all odd come later or vice versa.
package Questions;

import java.util.ArrayList;

public class EvenOddRearrange {
    public static void rearrangeEvenOdd(int[] arr) {
        // Initialize even and odd lists in a simplified way
        var evenList = new ArrayList<Integer>();
        var oddList = new ArrayList<Integer>();
        
        // Separate even and odd numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
        
        // Combine even numbers first, then odd numbers
        int index = 0;
        
        // Add even elements to the original array
        for (int i = 0; i < evenList.size(); i++) {
            arr[index++] = evenList.get(i);
        }
        
        // Add odd elements to the original array
        for (int i = 0; i < oddList.size(); i++) {
            arr[index++] = oddList.get(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
        
        rearrangeEvenOdd(arr);
        
        // Print the rearranged array using a traditional for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

