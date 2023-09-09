package Others.TUF2.DP_1D;

import java.util.Arrays;

public class MaxSumAdjective {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,3,5,8,1,9};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(check(arr, arr.length-1,dp ));
    }
    static int check(int[] arr,int index,int[] dp){
        if (index<0){
            return 0;
        }
        if (dp[index]!=-1){
            return dp[index];
        }
        int take = arr[index]+check(arr, index-2, dp);
        int not_take = check(arr, index-1, dp);
        return dp[index] =  Math.max(take,not_take);
    }
}
