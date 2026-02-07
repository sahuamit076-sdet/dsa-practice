package dsa.greedy.easy;

import java.util.Arrays;

public class AssignCookies {

    public static void main(String[] args) {
        int[] cookies = {4, 2, 1, 2, 1, 3};
        int[] childs = {1, 5, 3, 3, 4};
        System.out.println(applicableChilds(cookies, childs));
    }

    //time complexity: O(n log n + m log m + n)
    //space complexity: O(n)
    static int applicableChilds(int[] cookies, int[] childs) {
        Arrays.sort(cookies); //[1,1,2,2,3,4]
        Arrays.sort(childs); //[1,3,3,4,5]
        int l = 0;
        int r = 0;
        while (l < cookies.length) {
            if(cookies[l] >= childs[r]) {
                r++;
            }
            l++;
        }

        return r;
    }

}
