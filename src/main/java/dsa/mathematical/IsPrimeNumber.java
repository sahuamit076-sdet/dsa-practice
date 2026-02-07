package dsa.mathematical;


//Approach 1 to find prime number
// To check if a number n is prime, we can loop from 2 to sqrt(n) and check if n is divisible by any of these numbers.
// If it is divisible by any of these numbers, then it is not a prime number.
// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)

public class IsPrimeNumber {

    public static void main(String[] args) {
        int n = 19;
        boolean ans = isPrime(n);
        System.out.println("Is " + n + " a prime number? " + ans);
    }

    //APPROACH 1: O(sqrt(n))
    private static boolean isPrime(int n) {

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
