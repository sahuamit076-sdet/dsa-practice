package dsa.arrays.easy;

// 1st approach is to
// check if each element is less than or equal to the next element
// Time Complexity: O(n)
// Space Complexity: O(1)

public class IsArraySorted {

    public static void main(String[] args) {
        //int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        boolean sorted = isSorted(arr);
        System.out.println(" The Arrays is Sorted " + sorted);
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
