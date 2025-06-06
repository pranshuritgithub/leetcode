class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        int maxProfit = 0;
        
        for(int i=0;i<prices.length;i++)
        {
            buy = Math.min(buy,prices[i]);
            sell = Math.max(sell,prices[i]-buy);
            maxProfit = Math.max(maxProfit,sell);
        }
        return maxProfit;
    }
}