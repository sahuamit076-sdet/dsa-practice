package dsa.string.medium;

public class NoOfPalindromicSubString {

    public static void main(String[] args) {
        String s = "ABBAC";
        int ans = countPalindromicSubString(s);
        System.out.println(ans);
    }

    //##################################################################################################################
    //Algo :  Using Center Expansion
    //Time complexity: 0(n^2)
    //Space complexity: 0(n)
    private static int countPalindromicSubString(String s) {
        int total = 0;
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            int count = countPalindromes(s, i, i);
            total += count;
            count = countPalindromes(s, i, i + 1);
            total += count;
        }
        return total;
    }

    private static int countPalindromes(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                count++;
            } else {
                break;
            }
            left--;
            right++;
        }

        return count;
    }


}
