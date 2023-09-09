package Others.TUF2.Subsequence;

import java.util.Arrays;

public class PartitionEqualSum {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,4,5};
        int sum=0;
        for(int e : arr){
            sum+=e;
        }
        if (sum%2==1){
            System.out.println(false);
        }
        else{
            Boolean dp [][] = new Boolean[arr.length][(sum/2)+1];
            System.out.println(check(arr,sum/2,0,dp));
            for (Boolean[] e : dp){
                System.out.println(Arrays.toString(e));
            }
        }
    }
    static boolean check(int[] arr,int k,int index,Boolean[][] dp){
        if (k==0){
            return true;
        }
        if (index>= arr.length){
            return false;
        }
        if (dp[index][k]!=null){
            return dp[index][k];
        }
        boolean take = false;
        if(arr[index]<=k){
            take = check(arr, k-arr[index], index+1,dp);
        }
        boolean not_take = check(arr, k, index+1,dp);
        return dp[index][k]= take||not_take;
    }
}
