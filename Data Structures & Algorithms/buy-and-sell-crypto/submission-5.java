class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        int j = 0;
        while(j < prices.length-1){
            if(prices[i] > prices[j]){
                i = j;
            }
            j++;
            maxProfit = Math.max(prices[j] - prices[i], maxProfit);
        }

        return maxProfit;
    }
}
