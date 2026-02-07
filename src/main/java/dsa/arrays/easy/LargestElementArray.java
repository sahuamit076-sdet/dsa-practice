package dsa.arrays.easy;

// 1st approach is to
// sort the array in ascending order and return the largest element
// Time Complexity: O(n log n)
// Space Complexity: O(1)

// 2nd approach (optimized)
// traverse the array and keep track of the largest element found so far
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LargestElementArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int largest = findLargestElement(arr);
        System.out.println("The largest element in the array is: " + largest);
    }

    public static int findLargestElement(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
