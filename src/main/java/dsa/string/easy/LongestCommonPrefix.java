package dsa.string.easy;


import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String ans = longestCommonPrefixSort(strs);
        System.out.println(ans);
    }

    //Approach 1: Horizontal Scanning
    // time complexity: O(n * m)  + O(n) = O(n * m)
    private static String longestCommonPrefix(String[] strs) {
        // time complexity: O(n)
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }
        // time complexity: O(n * m)
        for (int i = 0; i < minLength; i++) {
            for (String str : strs) {
                if (str.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return "";
    }

    // Approach 2: Sort and Compare
    // time complexity: O(n log n) + O(m) = O(n log n)
    private static String longestCommonPrefixSort(String[] strs) {
        // time complexity: O(n log n)
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        // time complexity: O(m)
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != last.charAt(i))
                return first.substring(0, i);
        }

        return "";
    }
}
