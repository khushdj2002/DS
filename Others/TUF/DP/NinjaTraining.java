package Others.TUF.DP;

import java.util.Arrays;

/*
In this question ninja will perform an activity of running or swimming or gym. It can perform only one in a single
day. It can't do multiple task and another rule is it can't do same activity in  consecutive days. Every activity has its own
point depend on what day you do . So what is the max output.
 */
public class NinjaTraining {
    public static void main(String[] args) {
        int[][]arr = {{1,2,5},{3,1,1},{3,3,3},};
        int[][] dp = new int[arr.length][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j]=-1;
            }
        }
//        Arrays.fill(dp,-1);
//        System.out.println(Arrays.toString(dp));
        System.out.println(ninja(arr,arr.length-1,arr[0].length-1,dp));
    }
    static int ninja(int[][] arr,int day,int n,int[][] dp){
        if (dp[day][n]!=-1){
            return dp[day][n];
        }
        if (n==0){
            int max=0;
            for (int i = 0; i < arr[0].length; i++) {
                if (i!=day){
                    max=Math.max(arr[n][i],max);
                }
            }
            return max;
        }

        int m = 0;

        for (int i = 0; i < arr[0].length; i++) {
            if (i!=day){
                int points = arr[n][i]+ninja(arr,i,n-1,dp);
                m=Math.max(points,m);
            }

        }
        return dp[day][n]=m;
    }
}
