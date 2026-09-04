class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy, sell;
        buy = 0; sell = 1;

        while (sell < prices.length) {
            int profit = prices[sell] - prices[buy];
            if (prices[buy] > prices[sell]) {
                buy = sell;
            } else if (profit > maxProfit) {
                maxProfit = profit;
            }

            sell++;
        }

        return maxProfit;
    }
}
