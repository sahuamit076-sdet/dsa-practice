package dsa.sorting;

import java.util.Arrays;

public class Sorting3_InsertionSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 0};
        insertionSort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }


    //Time complexity : O(n^2)
    // Best case : O(n) when array is already sorted
    //Space complexity : O(1)
    //builds the final sorted array one item at a time
    //by comparing the current element on the left
    //with the already sorted elements and inserting it in the correct position
    private static void insertionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j, j - 1);
                j--;
            }
        }


    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
