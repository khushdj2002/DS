package Others.TUF2.Subsequence;

public class UnboundKnapsack {
    public static void main(String[] args) {
        int[] wt = {2,4,6};
        int[] val = {5,11,13};
        int w =10;
        Integer[][] dp = new Integer[wt.length][w+1];
        System.out.println(check(wt,val,w,0,dp));
    }
    static int check(int[] wt,int[] val,int w,int index,Integer[][] dp){
        if (w<=0||index== wt.length){
            return 0;
        }
        if (dp[index][w]!=null){
            return dp[index][w];
        }
        int not_take =0;
        if(wt[index]<=w) {
             not_take = val[index]+check(wt, val, w-wt[index], index,dp);
        }
        int take = check(wt, val, w, index+1,dp);
        return dp[index][w]= Math.max(take,not_take);
    }
}
