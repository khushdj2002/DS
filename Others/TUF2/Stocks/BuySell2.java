package Others.TUF2.Stocks;

import Others.TUF2.String.LongestCommonSubsequence;

public class BuySell2 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Long[][] dp = new Long[prices.length][2];
        System.out.println(check(prices,0,0,dp));
    }
    static long check(int[] prices,int index,int buy,Long[][] dp){
        if (index== prices.length){
            return 0;
        }
        if(dp[index][buy]!=null){
            return dp[index][buy];
        }
        long profit=0;
        if (buy==0){
            profit = Math.max(check(prices, index+1, 0,dp),-prices[index]+check(prices, index+1, 1,dp));
        }
        if (buy==1){
            profit = Math.max(check(prices, index+1, 1,dp),prices[index]+check(prices, index+1, 0,dp));
        }
        return dp[index][buy]= profit;
    }
}
