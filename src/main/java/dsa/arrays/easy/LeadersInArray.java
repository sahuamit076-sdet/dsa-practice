package dsa.arrays.easy;


//Approach:
// Traverse the array from right to left
// keeping track of the maximum element seen so far.
// If the current element is greater than the maximum element,
// it is a leader, so we print it and update the maximum element.
// Time complexity: O(n)
// Space complexity: O(1)


public class LeadersInArray {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2, 0};
        findLeaders(arr);
    }

    private static void findLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}
