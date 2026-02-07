package dsa.string.easy;

public class LargestOddNumInString {

    public static void main(String[] args) {
        String num = "3542748";
        String ans = largestOddNumber(num);
        System.out.println(ans); // Output: "35427"
    }

    // Function to find the largest odd number in a string
    // Algorithm:
    // 1. Traverse the string from the end to the beginning
    // 2. Check if the current character is an odd digit
    // 3. If found, return the substring from the start to this character (inclusive)
    // 4. If no odd digit is found, return an empty string
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char digit = num.charAt(i);
            if (digit % 2 != 0) { // Check if the digit is odd
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
