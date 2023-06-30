class Solution {
    //run loop from 1 to end and check the minimum element from last array from 0 to that element.

    public int maxProfit(int[] prices) {
        int minn=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-minn;
            profit=Math.max(profit,cost);
            minn=Math.min(minn,prices[i]);
        }

        return profit;
    }
}
