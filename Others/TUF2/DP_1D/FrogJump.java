package Others.TUF2.DP_1D;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr= {10,20,30,10};
        int[] dp = new int[arr.length+1];
        Arrays.fill(dp,-1);
        System.out.println(check(arr, arr.length-1,dp));
    }
    static int check(int[] arr,int index,int[] dp){
        if (index==0){
            return 0;
        }
        if (dp[index]!=-1){
            return dp[index];
        }
        int take = check(arr,index-1,dp)+Math.abs(arr[index]-arr[index-1]);
        int not_take = Integer.MAX_VALUE;
        if (index>1) {
            not_take = check(arr, index - 2, dp) + Math.abs(arr[index] - arr[index - 2]);
        }
        return dp[index]=Math.min(take,not_take);
    }
}
