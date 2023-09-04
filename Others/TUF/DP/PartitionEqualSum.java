package Others.TUF.DP;

import java.util.Arrays;

public class PartitionEqualSum {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        if (sum%2==1){
            System.out.println("false");
        }
        else {
            int k = sum / 2;
            Boolean[][] dp = new Boolean[arr.length][k + 1];
            System.out.println(check(arr, k, arr.length - 1, dp));
            for(Boolean[] e : dp){
                System.out.println(Arrays.toString(e));
            }
        }
    }
    static boolean check(int[] arr,int k,int index,Boolean[][] dp){
        if (k==0){
            return true;
        }
        if (index==0){
            return arr[0]==k;
        }
        if (dp[index][k]!=null){
            return dp[index][k];
        }
        boolean not_take = check(arr,k,index-1,dp);
        boolean take = false;
        if (k>=arr[index]) {
            take = check(arr, k - arr[index], index - 1, dp);
        }

        return dp[index][k]=take||not_take;
    }
}
