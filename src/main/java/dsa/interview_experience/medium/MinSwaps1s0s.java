package dsa.interview_experience.medium;

public class MinSwaps1s0s {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 1, 1, 0};
        int ans = minSwaps(arr);
        System.out.println(ans);
    }

    static int minSwaps(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int swaps = 0;
        while (i < j) {
            if (arr[i] == 0) {
                if (arr[j] == 1) {
                    arr[i] = 1;
                    arr[j] = 0;
                    i++;
                    j--;
                    swaps++;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }

       return swaps;
    }
}
