package dsa.mathematical;

public class Gcd {

    public static void main(String[] args) {
        int a = 9;
        int b = 12;
        int result = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }

    //Approach 1
    // Iterative approach to find GCD
    // Time Complexity: O(min(a, b))
    // Space Complexity: O(1)
    private static int gcdIterative(int a, int b) {
        int gcd = 1;
        for (int i = 2; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    //Approach 2
    // Euclidean Algorithm to find GCD
    // GCD(a, b) = GCD(b, a % b)
    // Time Complexity: O(log(min(a, b)))
    // Space Complexity: O(1)
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }


}
