package dsa.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 2, 1, 2};
        System.out.println(majorityElement(arr));
    }

    //Approach: Using HashMap to count occurrences of each element
    //We iterate through the array and maintain a count of each element in a hashmap
    //If any element's count exceeds n/2, we return that element as the majority element
    // Space Complexity: O(n) for the hashmap
    // Time Complexity: O(n) for single pass through the array
    private static int majorityElement(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > arr.length / 2) {
                return num; // Return the majority element as soon as we find it
            }
        }
        return -1; // No majority element found
    }
}
