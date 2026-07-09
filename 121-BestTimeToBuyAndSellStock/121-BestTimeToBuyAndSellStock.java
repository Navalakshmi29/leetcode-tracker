// Last updated: 08/07/2026, 21:49:04

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Track the minimum price so far
            minPrice = Math.min(minPrice, prices[i]);
            // Calculate the profit if selling today
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
}
