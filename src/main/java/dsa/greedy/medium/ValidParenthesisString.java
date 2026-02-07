package dsa.greedy.medium;


//https://leetcode.com/problems/valid-parenthesis-string/description/
//Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
//'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
// time complexity: O(3^n)
// space
public class ValidParenthesisString {

    public static void main(String[] args) {
        String s = "(*()";
        boolean ans = isValid(s, 0, 0);
        System.out.println(ans);
    }

    static boolean isValid(String s, int index, int count) {
        if (count < 0) return false;
        if (index == s.length()) return count == 0;
        if (s.charAt(index) == '(') {
            return isValid(s, index + 1, count + 1);
        } else if (s.charAt(index) == ')') {
            return isValid(s, index + 1, count - 1);
        } else {
            return isValid(s, index + 1, count + 1)
                    || isValid(s, index + 1, count - 1)
                    || isValid(s, index + 1, count);
        }
    }
}
