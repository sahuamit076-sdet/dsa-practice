package dsa.arrays.easy;

import java.util.Arrays;

// Merge two sorted arrays
// Approach 1 (Using Extra Space)
// 1. Create a new array to hold the merged elements.
// 2. Use two pointers to traverse the two arrays and compare elements.
// 3. Add the smaller element to the new array and move the pointer.
// 4. If elements are equal, add both and move both pointers.
// 5. If one array is exhausted, add the remaining elements of the other array.
// 6. Return the new array.
// Time complexity: O(n1 + n2), Space complexity: O(n1 + n2)


public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 4};
        int[] arr2 = {2, 3, 4, 4, 5, 6};
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedArray));
    }


    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        // Merge the two arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        if (n1 < n2) {
            while (j < n2) {
                mergedArray[k++] = arr2[j++];
            }
        } else {
            while (i < n1) {
                mergedArray[k++] = arr1[i++];
            }
        }

        return mergedArray;
    }
}
