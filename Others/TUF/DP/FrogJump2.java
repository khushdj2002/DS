package Others.TUF.DP;

import java.util.Arrays;

public class FrogJump2 {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for (int i = 1; i < arr.length; i++) {
            int left = dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            if (i>1){
                int right = Math.abs(dp[i-2]+arr[i]-arr[i-2]);
                dp[i]=Math.min(left,right);
            }
            else{
                dp[i]=left;
            }
        }
        System.out.println(dp[dp.length-1]);
    }
}
