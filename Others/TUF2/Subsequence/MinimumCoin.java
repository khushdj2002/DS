package Others.TUF2.Subsequence;

public class MinimumCoin {
    public static void main(String[] args) {
        int[] coin = {1,2,3};
        int amount = 7;
        Integer[][] dp  = new Integer[coin.length][amount+1];
        System.out.println(check(coin,amount, coin.length-1,dp));
    }
    static int check(int[] coin,int amount,int index,Integer[][] dp){
        if (index==0){
            if(amount%coin[index]==0){
                return amount/coin[index];
            }
            else {
                return (int) 1e7;
            }
        }
        if (dp[index][amount]!=null){
            return dp[index][amount];
        }
        int take = (int) 1e7;
        int not_take = check(coin,amount,index-1,dp);
        if(amount>=coin[index]){
            take = 1+check(coin, amount-coin[index], index,dp);
        }
        return dp[index][amount]= Math.min(take,not_take);
    }
}
