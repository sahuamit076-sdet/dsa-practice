package dsa.arrays.hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TripletsSumZero {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        printTriplets(nums);
    }

    //Time complexity: O(n²)
    //Space complexity: O(n²)
    private static void printTriplets(int[] nums) {
        Set<String> triplet = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (set.contains(-sum)) {
                    int[] t = {nums[i], nums[j], -sum};
                    Arrays.sort(t);
                    triplet.add(Arrays.toString(t));
                } else {
                    set.add(nums[j]);
                }
            }
        }
        System.out.println(triplet);
    }
}
