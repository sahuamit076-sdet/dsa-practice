package dsa.arrays.medium;

import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] digits = {2, 1, 5, 4, 3, 0, 0};
        nextPermutation(digits);
        System.out.println(Arrays.toString(digits));
    }


    // Function to find the next permutation of the given array of digits
    //Time Complexity:  O(3n) ~ O(n)
    //O(n) for finding the index + O(n) for finding the element to swap + O(n) for reversing the sub-array
    //Best Case: O(n)  = when the array is in descending order => we only need to reverse the array
    //Space Complexity: O(1)
    private static void nextPermutation(int[] digits) {
        //step 1: find the first decreasing element from the end : O(n)
        int index1 = findIndexForDecreasingElement(digits);
        //step 2: if it is the last permute num
        if (index1 == -1) {
            reverse(digits, 0); // reverse the entire array : O(n)
            return;
        }
        //step 3: find the first element greater than digits[index] from the end : O(n)
        int index2 = -1;
        for(int i =digits.length-1; i>=0; i--){
            if(digits[i] > digits[index1]) {
                index2 = i;
                break;
            }
        }
        //step 4: swap
        swap(digits, index2, index1);
        //step 5: reverse the sub-array after index : O(n)
        reverse(digits, index1 + 1);
    }


    private static int findIndexForDecreasingElement(int[] digits) {
        for (int i = digits.length - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    // time complexity: O(1)
    private static void swap(int[] digits, int i, int j) {
        int temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    // time complexity: O(n) - best case: O(n/2)
    private static void reverse(int[] digits, int start) {
        int end = digits.length - 1;
        while (start < end) {
            swap(digits, start, end);
            start++;
            end--;
        }
    }
}
