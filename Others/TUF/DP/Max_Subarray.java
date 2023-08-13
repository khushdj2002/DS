package Others.TUF.DP;

import java.util.Arrays;

public class Max_Subarray {
    public static void main(String[] args) {
        int[] arr = {2,1,4,9};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(addSub(arr,dp,arr.length-1));

    }
    static int addSub(int[] arr, int[] dp,int n){
        if (n==0){
            return arr[0];
        }
        if (n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int pick = arr[n]+addSub(arr,dp,n-2);
        int not_pick = addSub(arr,dp,n-1);

        return dp[n]=Math.max(pick,not_pick);
    }
}
