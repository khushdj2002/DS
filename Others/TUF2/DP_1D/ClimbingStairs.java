package Others.TUF2.DP_1D;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(stair(n,dp));
    }
    static int stair(int n,int[] dp){
        if (n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if (dp[n]!=-1){
            return dp[n];
        }
        int take = stair(n-1,dp);
        int take_2 = stair(n-2,dp);
        return dp[n]=take_2+take;
    }
}
