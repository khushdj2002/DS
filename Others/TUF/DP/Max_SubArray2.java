package Others.TUF.DP;

import java.util.Arrays;

public class Max_SubArray2 {
    public static void main(String[] args) {
        int[] arr = {2,1,4,9};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(addSub(arr,dp,arr.length));

    }
    static int  addSub(int[] arr,int[] dp,int n){
        dp[0]=arr[0];
        for (int i = 1; i <n ; i++) {
            int take = arr[i];
            if (i>1){
                take=take+dp[i-2];
            }
            int not_take = dp[i-1];
            dp[i] = Math.max(take,not_take);
        }
        return dp[dp.length-1];
    }
}
