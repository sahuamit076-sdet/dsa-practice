package dsa.arrays.medium;

public class CountSubArrayKOddNumb {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println(count(arr, k));
    }

    static int count(int[] arr, int k) {
        int count = 0;
        int l = 0, r = 0;
        int odds = 0;
        while (r < arr.length) {
            if (arr[r] % 2 != 0 && odds >= k) {
                count++;
                l++;
                r = l;
                odds = 0;
            } else if (arr[r] % 2 == 0) {
                r++;
            } else {
                odds++;
                r++;
            }
        }
        if(odds >= k) count++;
        return count;
    }
}
