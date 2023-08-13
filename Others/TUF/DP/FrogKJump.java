package Others.TUF.DP;

import java.util.Arrays;

public class FrogKJump {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {30,10,60,10,60,50};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for (int i = 1; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <=k ; j++) {
                if (i - j >= 0) {
                    int left = dp[i - j] + Math.abs(arr[i] - arr[i - j]);
                    min = Math.min(min, left);
                }
                else {
                    break;
                }
            }
            dp[i]=min;
        }
        System.out.println(dp[dp.length-1]);
    }
}
