package dsa.arrays.easy;


// 1st approach is to
// sort the array in ascending order ,
// from the sorted array return the 2nd largest element by traversing from the end of the array
// Time Complexity: O(n log n)
// Space Complexity: O(1)

// Better approach (optimized)
// traverse the array and keep track of the largest and 2nd largest element found so far
// Time Complexity: O(n)
// Space Complexity: O(1)



class SecondLargestElementArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, -1, 4, 9, 8};
        int secondLargest = findSecondLargestElement(arr);
        System.out.println("The second largest element in the array is: " + secondLargest);
    }

    public static int findSecondLargestElement(int[] arr) {
        // Initialize the largest and second largest variables
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
