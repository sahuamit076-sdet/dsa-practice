package dsa.arrays.medium;

import java.util.Arrays;


//Approach  : Using Constant Space
// Use while loop to iterate through the array and swap elements to their correct positions.
// Time complexity : O(n) where n is the number of elements in the array
// Space complexity : O(1) as no extra space is used


public class ReArrangeElementsSign {

    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, -6, -7, 8, 9};
        //rearrange(arr);
        reArrangeConstantSpace(arr);
        System.out.println(Arrays.toString(arr));
    }



    private static void reArrangeConstantSpace(int[] arr) {
        int n = arr.length;

        while(true) {
            int posIndex = 0;
            int negIndex = 1;

            // Find the next misplaced positive element
            while (posIndex < n && arr[posIndex] >= 0) {
                posIndex += 2;
            }

            // Find the next misplaced negative element
            while (negIndex < n && arr[negIndex] < 0) {
                negIndex += 2;
            }

            // If either index goes out of bounds, break the loop
            if (posIndex >= n || negIndex >= n) {
                break;
            }

            // Swap the misplaced elements
            int temp = arr[posIndex];
            arr[posIndex] = arr[negIndex];
            arr[negIndex] = temp;
        }
    }
}
