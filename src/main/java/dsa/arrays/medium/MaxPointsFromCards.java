package dsa.arrays.medium;

public class MaxPointsFromCards {

    public static void main(String[] args) {
        int[] points = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        int max = maxPoints(points, k);
        System.out.println(max);
    }

    static int maxPoints(int[] points, int limit) {
        int n = points.length;
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += points[i];
        }


        int leftSum = sum;
        int rightSum = 0;
        for (int i = limit-1, j = 0; i >= 0; i--, j++) {
            leftSum = leftSum - points[i];
            rightSum = rightSum + points[n - 1 - j];
            sum = Math.max(sum, leftSum + rightSum);
        }

        return sum;
    }
}
