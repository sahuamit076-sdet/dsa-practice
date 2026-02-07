package dsa.arrays.hard;


//Approach 1 : Linear Search
// check each 1D array range wise if the target is present in that range or not.
// If present then do a binary search in that 1D array to find the target element
// time complexity : O(n + log m) where n is number of rows and m is number of columns


// Approach 2 : Binary Search
// We can treat the 2D matrix as a 1D sorted array.
// The element at position (i, j) in the 2D matrix can be accessed using
// time complexity : O(log(n*m)) where n is number of rows and m is number of columns


public class SearchInSortedMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 23;
        System.out.println(searchMatrix(matrix, target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }

        // Binary Search with 1D array mapping
        int low = 0;
        int high = matrix.length * matrix[0].length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }


}
