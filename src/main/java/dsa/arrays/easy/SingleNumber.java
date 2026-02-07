package dsa.arrays.easy;

// Approach1
//  use hashmap to store the frequency of each number
//  iterate through the hashmap to find the number with frequency 1
//  return that number
//  time complexity is O(n) and space complexity is O(n)

// Approach2
//  use XOR operation to find the number with frequency 1
//  XOR of a number with itself is 0
//  XOR of a number with 0 is the number itself
//  XOR is commutative and associative
//  so we can XOR all the numbers in the array and the result will be the number with frequency 1
//  time complexity is O(n)

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 1, 4};
        int singleNumber = findSingleNumber(arr);
        System.out.println("The single number is: " + singleNumber);
    }

    public static int findSingleNumber(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result = result ^ num; // XOR operation (0 ^ num = num and num ^ num = 0)
            System.out.println(result);
        }
        return result;
    }
}
