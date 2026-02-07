package dsa.sorting.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting4_MergeSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 0};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:" + Arrays.toString(arr));
    }


    // time complexity : O(n log n) (best, average, worst)
    // space complexity : O(n)
    // Divide and Conquer algorithm
    // divides the array into two halves
    // recursively sorts them up to single element
    // then merges the sorted halves by comparing elements from both halves
    // and placing them in the correct order
    private static void mergeSort(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> integers = new ArrayList<>();
        //[low....mid] and [mid+1...high]
        int left  = low;
        int right = mid + 1;
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                integers.add(arr[left]);
                left++;
            } else {
                integers.add(arr[right]);
                right++;
            }
        }

        while (left<= mid) {
            integers.add(arr[left]);
            left++;
        }

        while (right <= high) {
            integers.add(arr[right]);
            right++;
        }

        //copy back to arr
        for (int i = low; i <= high; i++) {
            arr[i] = integers.get(i - low);
        }
    }

}
