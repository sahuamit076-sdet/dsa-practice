package dsa.sorting.easy;

import java.util.Arrays;

public class Sorting1_SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        selectionSort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));

    }

    //Time complexity : O(n^2) (worst)
    // Best case : O(n^2) (even if array is sorted)
    //Space complexity : O(1)
    //select the minimum element from unsorted array and swap it with the first element of unsorted array
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            // Find the minimum element (selection)
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the selected with the first element
            swap(arr, minIdx, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
