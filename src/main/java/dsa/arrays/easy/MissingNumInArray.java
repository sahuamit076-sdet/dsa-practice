package dsa.arrays.easy;

public class MissingNumInArray {

    public static  void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int missingNumber = findMissingNumber(arr, arr.length);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum; // The difference is the missing number
    }
}
