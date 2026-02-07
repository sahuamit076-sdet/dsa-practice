package dsa.arrays.easy;


// 1st approach is to
// create a new array and copy only unique elements to the new array
// Time Complexity: O(n^2) - nested loop to check for duplicates
// Space Complexity: O(n) - new array

// Better approach
// use a HashSet to store unique elements
// Time Complexity: O(n) - single loop to traverse the array
// Space Complexity: O(n) - HashSet to store unique elements


// Optimal approach if the array is sorted
// Use two pointers to keep track of the next unique element
// Time Complexity: O(n) - single loop to traverse the array
// Space Complexity: O(1) - no extra space needed


import java.util.Arrays;

public class RemoveDuplicateInSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 5};
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int[] arr) {
        // Initialize the index of the next unique element
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            // If the current element is different from the last unique element found
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j]; // Move the unique element to the front
            }
        }
        System.out.println("The length of the array after removing duplicates is: " + (i + 1));
        while (i < arr.length - 1) {
            arr[i + 1] = 0; // Optional: Fill the rest of the array with zeros
            i++;
        }
        System.out.println("The array after removing duplicates is: " + Arrays.toString(arr));
    }
}
