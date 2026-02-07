package dsa.arrays.medium;

// Approach : Kadane's Algorithm
// Iterate through the array while maintaining a running sum of the current subarray.
// If the running sum becomes negative, reset it to zero.
// Keep track of the maximum sum encountered during the iteration.
// Time complexity : O(n) where n is the number of elements in the array


public class MaximumSubArraySum {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, -1, 1, 5, -3};
        System.out.println(maxSubArray(arr));
    }

    private static int maxSubArray(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = -1;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if(sum ==0) start = i;
            sum += arr[i];
            if(sum > maxSum) {
                maxSum = sum;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("Start Index: " + start + ", End Index: " + end);
        return maxSum;
    }
}
