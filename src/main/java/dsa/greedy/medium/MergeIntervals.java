package dsa.greedy.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 9}, {9, 11}, {8, 10}, {2, 4}, {15, 18}, {16, 17}};
        List<List<Integer>> ans = merge(intervals);
        System.out.println(ans);
    }


    // Time Complexity: O(n log n) + O(n) = O(n log n)
    // Space Complexity: O(n)
    private static List<List<Integer>> merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int n = intervals.length;

        List<List<Integer>> pairs = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                pairs.add(List.of(start, end));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        pairs.add(List.of(start, end));
        return pairs;
    }
}
