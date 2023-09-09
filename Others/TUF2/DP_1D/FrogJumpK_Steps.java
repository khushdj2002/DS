package Others.TUF2.DP_1D;

import java.util.Arrays;

public class FrogJumpK_Steps {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int [] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        int k=2;
        System.out.println(check(arr, arr.length-1,k,dp ));
    }
    static int check(int[] arr,int index,int k,int[] dp){
        if (index==0){
            return 0;
        }
        if (dp[index]!=-1){
            return dp[index];
        }
        int mmsteps= Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            if (index-i>=0){
                int jump = check(arr, index-i, k, dp)+Math.abs(arr[index]-arr[index-i]);
                mmsteps = Math.min(mmsteps,jump);
            }

        }
        return dp[index] = mmsteps;
    }
}
