package Others.TUF2.LongestCommonSub;

import java.util.Arrays;
import java.util.Map;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        Integer[][] dp = new Integer[arr.length][arr.length];
        System.out.println(check(arr,0,-1,dp));
    }
    static int check(int[] arr,int index,int prev,Integer[][] dp){
        if (index== arr.length){
            return 0;
        }
        int take = 0;
        if (dp[index][prev+1]!=null){
            return dp[index][prev+1];
        }
        int not_take = check(arr, index+1, prev,dp);
        if (prev==-1||arr[prev]<arr[index]){
            take = 1+check(arr, index+1, index,dp);
        }
        return dp[index][prev+1] =  Math.max(take,not_take);
    }
}
