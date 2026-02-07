package dsa.arrays.medium;


import java.util.HashMap;
import java.util.Map;

//Approach 1: Using HashMap to store the cumulative sum and its index
//If the cumulative sum - k exists in the map, we found a subarray with sum k
//We update the maximum length of such subarrays found
// Space Complexity: O(n) for the hashmap
// Time Complexity: O(n) for single pass through the array


//Approach 2: Using Sliding Window Technique (only works for non-negative numbers)
//We maintain a window and expand it by adding elements to the right
//If the sum exceeds k, we shrink the window from the left
//We keep track of the maximum length of the window when the sum equals k
// Space Complexity: O(1) as we are using only a few variables
// Time Complexity: O(n) for single pass through the array
// Worst time complexity: O(2n) in case of all elements being added and then removed


public class SubArraySumK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 4;
        System.out.println(maxSubArraySlidingWindow(arr, k));
    }


    //Approach 1: Using HashMap to store the cumulative sum and its index
    private static int maxSubArray(int[] arr, int k) {
        int sum = 0;
        int length = 0;
        Map<Integer, Integer> tracker = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                length = i + 1;
            }
            int rem = (sum - k);
            if (tracker.containsKey(rem)) {
                length = Math.max(length, i - tracker.get(rem));
            }
            tracker.put(sum, i);
        }
        return length;
    }

    //Approach 2: Using Sliding Window Technique (only works for non-negative numbers)
    private static int maxSubArraySlidingWindow(int[] arr, int k) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int maxLength = 0;

        while (end < arr.length) {
            while (sum > k && start <= end) { // Shrink the window if sum exceeds k
                sum -= arr[start]; // Reduce the sum by removing elements from the start
                start++; // Shrink the window from the left
            }
            if (sum == k) { // Check if we found a subarray with sum k
                maxLength = Math.max(maxLength, end - start);
            }
            sum += arr[end];
            end++;
        }

        return maxLength;
    }
}
