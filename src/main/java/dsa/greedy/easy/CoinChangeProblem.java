package dsa.greedy.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChangeProblem {

    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 50, 20, 100, 500};
        int target = 87;
        List<Integer> ans = minCoins(coins, target);
        System.out.println(ans);
    }

    // time complexity : O(n) + O(n log n)
    private static List<Integer> minCoins(int[] coins, int target) {
        Arrays.sort(coins);

        List<Integer> min = new ArrayList<>();
        for (int i = coins.length - 1; i >= 0; i--) {
            while (target >= coins[i]) {
                target = target - coins[i];
                min.add(coins[i]);
            }
        }

        return min;
    }


}
