package dsa.string.medium;

public class MinimumDepthParentheses {

    public static void main(String[] args) {
        String s = "()(())((()()))";
        int ans = maxDepth(s);
        System.out.println(ans); // Output: 1
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }

        return maxDepth;

    }
}
