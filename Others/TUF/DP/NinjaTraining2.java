package Others.TUF.DP;

import java.util.Arrays;

public class NinjaTraining2 {
    public static void main(String[] args) {
        int[][]arr = {{1,2,5},{3,1,1},{3,3,3}};
        int[][] dp = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                dp[i][j]=-1;
            }
        }

    }
}
