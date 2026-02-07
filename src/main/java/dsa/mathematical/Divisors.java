package dsa.mathematical;


//Approach 1 to find all divisors of a number
// what are divisors? -> numbers that divide n completely leaving no remainder
// For example, divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36
// loop from 1 to n and check if i divides n completely
// Time Complexity: O(n)
// Space Complexity: O(1)


// Approach 2 to find all divisors of a number
//  loop from 1 to sqrt(n) and check if i divides n completely
//  if yes, then both i and n/i are divisors
// Time Complexity: O(sqrt(n))
// Space Complexity: O(k) where k is the number of divisors

import java.util.Set;
import java.util.TreeSet;

public class Divisors {

    public static void main(String[] args) {
        int n = 36;
        System.out.println("Divisors of " + n + " are:");
        printDivisors(n);
        //printDivisors2(n);
    }

    //APPROACH 1: O(n)
    private static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    //APPROACH 2: O(sqrt(n))
    private static void printDivisors2(int n) {
        Set<Integer> divisors = new TreeSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        System.out.println(divisors);
    }


}
