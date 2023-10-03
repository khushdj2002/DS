package Others.TUF.DP;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {41, 34, 46, 9, 37, 32, 42, 21, 7, 13, 1 ,24, 3 ,43, 2 ,23 ,8 ,45, 19, 30, 29, 18 ,35, 11};
        Arrays.sort(coins);
        int amount = 250;
        Integer[][] dp = new Integer[coins.length][amount+1];
        System.out.println(check(amount, coins.length-1, coins,dp));
    }
    static int check(int amount,int index,int[] coin,Integer[][] dp){
        if(index==0){
            if (amount%coin[index]==0){
                return amount/coin[index];
            }
            else {
                return (int) 1e7;
            }
        }
        if (dp[index][amount]!=null){
            return dp[index][amount];
        }


        int not_take = check(amount, index-1, coin,dp);
        int take = (int)1e7;
        if(amount>=coin[index]) {
            take = 1+check(amount - coin[index], index, coin,dp);
        }
        return dp[index][amount]= Math.min(take,not_take);
    }
}
