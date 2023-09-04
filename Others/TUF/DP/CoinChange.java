package Others.TUF.DP;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
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
