package dsa.arrays.medium;

public class MaxPointsFromCards {

    public static void main(String[] args) {
        int[] points = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;
        int max = maxPoints(points, k);
        System.out.println(max);
    }

    static int maxPoints(int[] points, int k) {
        int sum = 0;
        for(int i = 0 ; i < k; i++) {
            sum+=points[i];
        }

        int leftSum = sum;
        int rightSum = 0;
        int n = points.length;
        for(int j = 0 ; j < k; j++) {
            rightSum+=points[n-1-j];
            leftSum = leftSum - points[k-j-1];
            sum = Math.max(sum, leftSum+rightSum);
        }

        return sum;
    }
}
