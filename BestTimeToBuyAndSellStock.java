class Solution {
    public int maxProfit(int[] prices) {
        int min_val=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<prices.length;i++){

            //updating min value
            if(prices[i]<min_val){
                min_val=prices[i];
            }           
            //getting profit when selling today, and check whether getting maximum profit or not
            else if(prices[i]-min_val>max_profit){
                max_profit=prices[i]-min_val;
            }
        }
        return max_profit;
    }
}
