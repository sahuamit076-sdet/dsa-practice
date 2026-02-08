package dsa.arrays.easy;

import java.util.Arrays;

// Approach : Two Pointer Technique
// Use two pointers to track the next even and odd indices.
// Swap elements that are out of place until all even indices have even numbers and odd indices have odd numbers.
// Time complexity : O(n) where n is the number of elements in the array
// Space complexity : O(1) as no extra space is used

//Approach 2 : Using Constant Space
// Use while loop to iterate through the array and swap elements to their correct positions.
// Time complexity : O(n) where n is the number of elements in the array
// Space complexity : O(1) as no extra space is used

public class ArrangeEvenOdd {

    public static void main(String[] args) {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
        arrangeEvenOdd(arr);
        System.out.println(Arrays.toString(arr));
    }


    //Approach 2 : Using Constant Space
    private static void arrangeEvenOdd(int[] arr) {
        int n = arr.length;
        int evenIndex = 0;
        int oddIndex = 1;

        while (true) {
            // Find the next misplaced even element
            while (evenIndex < n && arr[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }
            // Find the next misplaced odd element
            while (oddIndex < n && arr[oddIndex] % 2 != 0) {
                oddIndex += 2;
            }

            // If either index goes out of bounds, we are done
            if (evenIndex >= n || oddIndex >= n) {
                break;
            }

            // Swap the misplaced elements
            int temp = arr[evenIndex];
            arr[evenIndex] = arr[oddIndex];
            arr[oddIndex] = temp;
        }
    }
}
