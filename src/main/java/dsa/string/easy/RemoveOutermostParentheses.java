package dsa.string.easy;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s)); // Output: ()()()
    }

    // time complexity: O(n)
    // space complexity: O(n)
    // Algorithm:
    // 1. Initialize a StringBuilder to store the result and a counter to track the number of open parentheses.
    // 2. Iterate through each character in the string:
    //    - If the character is '(', increment the counter.
    //    - If the character is ')', decrement the counter.
    //    - If the character is '(' and the counter is greater than 1, append it to the result.
    //    - If the character is ')' and the counter is greater than or equal to 1, append it to the result.
    // 3. Return the result as a string.
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(')
                openCount++;
            else
                openCount--;


            if (c == '(' && openCount > 1) {
                result.append(s.charAt(i));
            } else if (c == ')' && openCount >= 1) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }


}
