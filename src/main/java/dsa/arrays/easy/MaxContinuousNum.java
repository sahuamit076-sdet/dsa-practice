package dsa.arrays.easy;

public class MaxContinuousNum {

    public static void main(String[] args) {
        int[] arr = {5, 5, 1, 0, 4, 4, 4, 0, 4, 4, 5, 5, 5, 5};
        int maxCount = findMaxConsecutiveOnes(arr);
        System.out.println("The maximum number of consecutive is: " + maxCount);
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 1;
            }
        }
        return maxCount;
    }
}
