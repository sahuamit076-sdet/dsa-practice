package dsa.arrays.easy;

import java.util.Arrays;

//Approach: Counting Sort
//We count the number of 0s, 1s, and 2s in the array
//Then we overwrite the original array with the counted number of 0s, followed by 1s and then 2s
// Space Complexity: O(1) as we are using only a few variables
// Time Complexity: O(n) for single pass through the array




public class Sort0s1s2s {

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0, 0, 2, 1, 0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    // time complexity: O(n) = O(2n) ~ O(n)
    private static void sortColors(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int num : arr) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;
        while(index < arr.length) {
            if(index < count0) {
                arr[index] = 0;
            } else if(index < count0 + count1) {
                arr[index] = 1;
            } else {
                arr[index] = 2;
            }
            index++;
        }
    }
}
