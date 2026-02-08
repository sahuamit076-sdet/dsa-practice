package dsa.arrays.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxLengthSubArray2Type {

    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};

        int maxLength = 0;
        int left = -1;
        int right = -1;
        int start = 0;
        int end = 0;
        Set<Integer> uniques = new HashSet<>();
        while (end < arr.length) {
            if (uniques.size() < 2) {
                uniques.add(arr[end]);
                end++;
            } else {
                if (maxLength < (end - start)) {
                    maxLength = end - start;
                    left = start;
                    right = end;
                }
                end--;
                start = end;
                uniques.clear();
            }
        }

        int[] subArray = Arrays.copyOfRange(arr, left, right);
        System.out.println(Arrays.toString(subArray));
    }

}
