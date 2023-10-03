package Others.TUF.DP;

import java.util.Arrays;

public class CoinChange2 {
        public static void main(String[] args) {
            int[] coins = {41, 34, 46, 9 ,37 ,32, 42, 21, 7 ,13, 1 ,24, 3 ,43 ,2 ,23, 8 ,45, 19, 30, 29, 18, 35, 11};
            Arrays.sort(coins);
            int amount = 250;
            Integer[][] dp = new Integer[coins.length][amount+1];
            System.out.println(check(amount, coins.length-1, coins,dp));
            long a = 15685693751L;
            System.out.println(Integer.MAX_VALUE);
            System.out.println(a);
        }
        static int check(int amount,int index,int[] coin,Integer[][] dp){
            if (amount==0){
                return 1;
            }
            if(index==0){
                if (amount%coin[index]==0){
                    return 1;
                }
                else {
                    return 0;
                }
            }
            if (dp[index][amount]!=null){
                return dp[index][amount];
            }


            int not_take = check(amount, index-1, coin,dp);
            int take = 0;
            if(amount>=coin[index]) {
                take = check(amount - coin[index], index, coin,dp);
            }
            return dp[index][amount]= take+not_take;
        }

}
