class Solution {
    public int maxProfit(int[] prices) {
        int buyIdx = 0;
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[buyIdx] > prices[i]){
                buyIdx = i;
            }
            else if((maxProfit + prices[buyIdx]) < prices[i] && buyIdx <= i){
                if(maxProfit < (prices[i] - prices[buyIdx])){
                    maxProfit = prices[i] - prices[buyIdx];
                }
            }
        }
        System.out.println(buyIdx);
        return maxProfit;
    }
}
