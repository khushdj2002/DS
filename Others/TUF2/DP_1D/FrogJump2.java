package Others.TUF2.DP_1D;

import java.util.Arrays;

public class FrogJump2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,10};
        int[] dp = new int[arr.length];
        dp[0]=0;
        for (int i = 1; i < dp.length; i++) {
            int jump2 = Integer.MAX_VALUE;
            int jump1 = dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            if (i>1){
                jump2 = dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            }
            dp[i]=Math.min(jump1,jump2);
        }
        System.out.println(dp[dp.length-1]);
    }
}
