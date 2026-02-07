package dsa.recursion.easy;

public class SumOfNumbers {

    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }

    // Approach: Recursion
    // Time Complexity: O(n)
    // Space Complexity: O(n) due to recursion stack
    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }


}
