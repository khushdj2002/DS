package Others.TUF.DP;

public class Knapsack {
    public static void main(String[] args) {
        int w =10;
        int[] val = {7,9,5};
        int[] wt = {1,3,9};
        Integer[][] dp = new Integer[wt.length][w+1];
        System.out.println(check(w,wt,val,wt.length-1,dp));
    }
    static int check(int w,int[] wt,int[] val,int index,Integer[][] dp){

        if (index==0){
            return w/wt[0]*val[0];
        }
        if (dp[index][w]!=null){
            return dp[index][w];
        }
        int not_taken = check(w,wt,val,index-1,dp);
        int taken = Integer.MIN_VALUE;
        if (wt[index]<=w){
            taken =val[index]+check(w-wt[index],wt,val,index,dp);
        }
        return dp[index][w]=Math.max(taken,not_taken);
    }
}
