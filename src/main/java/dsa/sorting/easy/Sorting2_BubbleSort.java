package dsa.sorting.easy;

import java.util.Arrays;

public class Sorting2_BubbleSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 0};
        bubbleSort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));

    }

    //Time complexity : O(n^2)
    // Best case : O(n) when array is already sorted
    //Space complexity : O(1)
    // compare adjacent elements and swap if they are in wrong order
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
                System.out.println(i +"--:" + Arrays.toString(arr));
                i = -1; // reset i to -1 so that it becomes 0 after i++ in the for loop
            }
        }


    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
