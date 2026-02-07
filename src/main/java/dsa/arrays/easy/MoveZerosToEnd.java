package dsa.arrays.easy;

// Approach 1 (Two Pointer Approach - not maintaining order of non-zero elements)
// 1. Initialize two pointers, i and j. i will traverse the array from the start, and j will traverse from the end.
// 2. Increment i until a zero is found.
// 3. Decrement j until a non-zero element is found.
// 4. If i < j, swap the elements at i and j.
// 5. Repeat steps 2-4 until i >= j.
// Time complexity: O(n), Space complexity: O(1)
// Note: This approach does not maintain the order of non-zero elements. If maintaining order is

// Approach 2 ( Two Pointer Approach - maintaining order of non-zero elements)
// 1. Initialize a pointer j to keep track of the position of the next non-zero
// 2. Traverse the array with pointer i
// 3. If arr[i] is non-zero, assign arr[j] = arr[i]
// 4. Increment j
// 5. After the loop, fill the rest of the array with zeros from index j
// Time complexity: O(n), Space complexity: O(1)
// Note: This approach maintains the order of non-zero elements.


import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 3, 2, 0, 4, 0, 5, 0};
        moveZerosToEnd2(arr);
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));

    }

    //Approach 1 (but not maintaining order of non-zero elements)
    public static void moveZerosToEnd(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0 && arr[j] != 0) {
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (arr[i] != 0) {
                i++;
            } else {
                j--;
            }
        }
    }

    //Approach 2 (but  maintaining order of non-zero elements)
    public static void moveZerosToEnd2(int[] arr) {
        int n = arr.length;
        int i = 0, j = i + 1;

        while (i < n && j < n)  {
            if (arr[i] == 0 && arr[j] != 0) {
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if (arr[i] != 0) {
                i++;
            } else {
                j++;
            }
        }
    }


}


