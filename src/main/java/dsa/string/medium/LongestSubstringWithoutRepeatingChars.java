package dsa.string.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {

    public static void main(String[] args) {
        String s = "cadbzabcd";
        String ans = longestSubString(s);
        System.out.println(ans);
    }

    // time complexity: O(n)
    private static String longestSubString(String s) {
        Map<Character, Integer> indexMap = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while (right < s.length()) {
            int index = indexMap.getOrDefault(s.charAt(right), -1);
            if (index != -1 && index >= left) {
                max = Math.max(max, right - 1 - left + 1);
                left = index+1;
            }
            indexMap.put(s.charAt(right), right);
            right++;
        }
        System.out.println(max);
        return s.substring(left, right);
    }
}
