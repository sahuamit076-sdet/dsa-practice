package dsa.arrays.medium;

import java.util.Arrays;

public class MaxConsecutiveOneWithReplace {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 0, 1 ,0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        checkMax(arr, k);
    }

    static void checkMax(int[] arr, int k) {
        int zeroes = k;
        int length = 0;
        int start = -1;
        int end = -1;

        int l = 0;
        int r = 0;
        while (r < arr.length) {
            if (arr[r] == 0 && zeroes > 0) {
                zeroes--;
                r++;
            } else if (arr[r] == 1) {
                r++;
            } else {
                if (r - l > length) {
                    length = r - l;
                    start = l;
                    end = r;
                }
                l =  r -1;
                zeroes = k; //reset
                r = l;
            }
        }
        System.out.println(length);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, start, end)));
    }
}
