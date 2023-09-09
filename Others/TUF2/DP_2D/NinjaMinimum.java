package Others.TUF2.DP_2D;

import java.util.Arrays;

public class NinjaMinimum {
    public static void main(String[] args) {
        int[][] arr= {{1,2,2},{2,2,1},{2,1,2}};
        int[][] dp = new int[arr.length][4];
        for(int[] e:dp){
            Arrays.fill(e,-1);
        }
        System.out.println(check(arr.length-1,3,arr,dp));
    }
    static int check(int index,int day,int[][] arr,int[][] dp){
        if (index==0){
            int max= (int)1e7;
            for (int i = 0; i < 3; i++) {
                if (i!=day){
                    int act = arr[index][i];
                    max = Math.min(max,act);
                }
            }
            return max;
        }
        if(dp[index][day]!=-1){
            return dp[index][day];
        }
        int maxi = (int)1e7;
        for (int i = 0; i < 3; i++) {
            if (i!=day){
                int act = arr[index][i]+check(index-1, i, arr,dp);
                maxi=Math.min(act,maxi);
            }
        }
        return dp[index][day]=maxi;
    }

}
