package dsa.arrays.hard;

import java.util.*;

public class MajorityElement2 {

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,3,2,2,2};
        System.out.println(majorityElement(arr));
    }

    //Approach: Using HashMap to count occurrences of each element
    //We iterate through the array and maintain a count of each element in a hashmap
    //If any element's count exceeds n/2, we return that element as the majority element
    // Space Complexity: O(n) for the hashmap
    // Time Complexity: O(n) for single pass through the array
    private static Set<Integer> majorityElement(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Set<Integer> values = new HashSet<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) >=  (arr.length / 3)) {
                values.add(num);
            }
        }
        return values;
    }
}
