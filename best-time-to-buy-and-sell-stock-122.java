class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int min = prices[0];
        int profit =0;
        int n = prices.length;
        for(int i=0;i<n;i++)
        {
            if(prices[i]<min)
            {
                min  = prices[i];
            }
            profit = prices[i] - min;
            if(profit!=0)
            {
                maxprofit = profit+maxprofit;
                min = prices[i];
                profit = 0;
            }
        }
        return maxprofit; 
    }
}