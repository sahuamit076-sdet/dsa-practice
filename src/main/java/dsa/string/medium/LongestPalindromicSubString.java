package dsa.string.medium;

public class LongestPalindromicSubString {

    public static void main(String[] args) {
        String s = "ABBAC";
        String ans = longestPalindromicSubString(s);
        System.out.println(ans);
    }

    //##################################################################################################################
    //Algo :  Using Center Expansion
    //Time complexity: 0(n^2)
    //Space complexity: 0(n)
    private static String longestPalindromicSubString(String s) {
        int n = s.length();
        int start = -1, end = -1;
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            int len1 = longestPalindrome(s, i, i);
            int len2 = longestPalindrome(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > max) {
                max = len;
                start = i - (len / 2) + 1;
                end = i + (len / 2);
            }
        }
        return s.substring(start, end + 1);
    }

    private static int longestPalindrome(String s, int left, int right) {
        int max = 0;
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                max = Math.max(max, right - left + 1);
            } else {
                break;
            }
            left--;
            right++;
        }

        return max;
    }


}
