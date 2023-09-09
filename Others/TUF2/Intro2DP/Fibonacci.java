package Others.TUF2.Intro2DP;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;

public class Fibonacci {
    public static void main(String[] args) {
        int n =5;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(check(n,dp));
        System.out.println(Arrays.toString(dp));
    }
    static int check(int n,int[] dp){
        if (n<=1){
            return n;
        }
        if (dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=check(n-1,dp)+check(n-2,dp);
    }
}
