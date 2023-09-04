package Others.TUF.DP;

import java.util.ArrayList;
import java.util.List;

public class CountSubsets {

    public static void main(String[] args) {
        int[] nums = {2,34,5};
        int k= 40;
        Integer[][] dp = new Integer[nums.length][k+1];
        System.out.println(check(k,0,nums,dp));

    }
    static int check(int k,int index,int[] arr,Integer[][] dp){
        if (k==0){
            return 1;
        }
        if (index==arr.length){
            return 0;
        }
        if (arr[index]>k){
            return 0;
        }
        if (dp[index][k]!=null){
            return dp[index][k];
        }

       int take= check(k-arr[index], index+1, arr,dp);

        int not_take = check(k, index+1, arr,dp);
        return dp[index][k]= take+not_take;
    }
}
