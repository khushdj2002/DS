package Others.TUF.DP;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(jump(arr,dp, arr.length-1));
    }
    static int jump(int[] arr,int[] dp,int n){
        if (n==0){
            return 0;
        }
        if (dp[n]!=-1){
            return dp[n];
        }
        int left = jump(arr, dp, n-1)+Math.abs(arr[n]-arr[n-1]);
        int right = Integer.MAX_VALUE;
        if (n>1){
            right = jump(arr, dp, n-2)+Math.abs(arr[n]-arr[n-2]);
        }
        return dp[n]=Math.min(left,right);
    }
}
