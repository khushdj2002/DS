package Others.TUF2.Subsequence;

import java.util.Arrays;

public class PartitionSet2ArrayMinimum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        Boolean[][] dp = new Boolean[arr.length][(sum/2)+1];
        check(arr,dp, arr.length-1,sum/2);
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
    }
    static boolean check(int[] arr,Boolean[][] dp,int index,int target){
        if (target==0){
            return dp[index][target]=true;
        }
        if (index==0){
            if (arr[index]==target){
                return dp[index][target]=true;
            }
            return dp[index][target] = false;
        }
        if (dp[index][target]!=null){
            return dp[index][target];
        }
        boolean not_take = check(arr, dp, index-1, target);
        boolean take= false;
        if (arr[index]>=target){
            take = check(arr, dp, index-1, target-arr[index]);
        }
        return dp[index][target]=take||not_take;
    }
}
