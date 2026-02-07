package dsa.arrays.easy;

//Approach
//From last day to the first day,
// if the price of the current day is greater than the previous day,
// we add the difference to the profit.
// This way, we accumulate all the profitable transactions.
// time complexity O(n)
// space complexity O(1)

public class StockBuySell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4, 8};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = prices.length - 1; i > 0; i--) {
            if (prices[i] - prices[i - 1] > 0) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
