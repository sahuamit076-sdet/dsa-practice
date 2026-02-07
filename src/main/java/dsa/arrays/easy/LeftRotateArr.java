package dsa.arrays.easy;

// Rotate an array by k elements
// 1st approach is to
// 1. Store first k elements in a temp array
// 2. Shift the rest of the array to the left by k
// 3. Copy the temp array elements to the end of the original array
// Time complexity: O(n+k) , Space complexity: O(k)


import java.util.Arrays;

public class LeftRotateArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int k = 3;
        rotateArrayLeft(arr, k);

        System.out.println("The array after rotation is: " + Arrays.toString(arr));
    }

    //Approach 1 (Using temp array)
    public static void rotateArrayLeft(int[] arr, int k) {
        k = k % arr.length; // in case k is greater than array length
        int n = arr.length;
        //temp array to store first k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        //shift the rest of the array to the left by k
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        //copy the temp array elements to the end of the original array
        for (int i = 0; i < temp.length; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    //Approach 2 (Using Reversal Algorithm)
// 1. Reverse first k elements
// 2. Reverse the rest of the array
// 3. Reverse the entire array
// Time complexity: O(2n) , Space complexity: O(1)
    public static void rotateArrayLeft2(int[] arr, int k) {
        reverse(arr, 0, k - 1); // reverse first k elements
        reverse(arr, k, arr.length - 1); // reverse the rest of the array
        reverse(arr, 0, arr.length - 1); // reverse the entire array
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}


