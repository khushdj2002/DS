package Others.TUF;

import java.util.Arrays;

public class ValidPartitionOfArray {
    public static void main(String[] args) {
        int[] arr={4,4,4,4,5,6};
        System.out.println(checkPartition(arr));

    }
    static  boolean  checkPartition(int[] arr) {
        int n = arr.length;
        boolean[] dp = new boolean[n+1];
        dp[n]=true;
        for (int i = n-1; i >=0 ; i--) {
            if(i+1<n){
                if((arr[i]==arr[i+1])&&dp[i+2]){
                    dp[i]=true;
                }
                if(i+2<n){
                    if((arr[i]==arr[i+1]&&arr[i+1]==arr[i+2])&&dp[i+3]){
                        dp[i]=true;
                    }
                    if ((arr[i]+1==arr[i+1]&&arr[i+1]+1==arr[i+2])&&dp[i+3]){
                        dp[i]=true;
                    }
                }
            }
        }
        return dp[0];
    }

    static boolean isValid(int[] nums){
        if(nums.length==2){
            return nums[0]==nums[1];
        }
        if (nums.length==3){
            if(nums[0]==nums[1]&&nums[1]==nums[2]){
                return true;
            }
            if(nums[0]+1==nums[1]&&nums[1]+1==nums[2]){
                return true;
            }
        }
        return false;
    }
}
