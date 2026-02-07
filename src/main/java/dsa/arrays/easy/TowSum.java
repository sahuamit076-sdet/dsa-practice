package dsa.arrays.easy;

//Approach:1
// Using a HashMap to store the indices of the elements as we iterate through the array.
// For each element, we check if the complement (target - current element) exists in the map.
// If it does, we return the indices of the current element and its complement.

import java.util.*;

public class TowSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, -2, 3, 6};
        int target = 9;
        twoSum(nums, target);
    }

    private static void twoSum(int[] nums, int target) {
        int n = nums.length;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(target - num)) {
                System.out.println("Pair: " + (target - num) + ", " + num);
            } else {
                set.add(num);
            }
        }

    }
}
