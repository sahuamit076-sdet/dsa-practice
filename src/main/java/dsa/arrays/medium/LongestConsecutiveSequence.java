package dsa.arrays.medium;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {100, 102, 100, 101, 101, 4, 3, 2, 3, 2, 1, 1, 1, 2};
        System.out.println(longestConsecutive(arr)); // Output: 4
    }

    // Approach: Sorting
    // Time Complexity: O(n log n) -> 0(n) + O(n log n) for sorting
    // Space Complexity: O(1)
    // LeetCode Link: https://leetcode.com/problems/longest-consecutive-sequence/
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); // Output: 4

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

}
