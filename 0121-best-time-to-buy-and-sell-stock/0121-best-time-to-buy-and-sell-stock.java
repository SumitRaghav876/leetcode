class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int sP;
        int BuyPrice=prices[0];

        for(int i=1;i<prices.length; i++){
            int profit=prices[i]-BuyPrice;
            if(profit<0){
                BuyPrice=prices[i];
            }
            else{
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }
}