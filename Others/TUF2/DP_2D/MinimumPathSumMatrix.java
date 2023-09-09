package Others.TUF2.DP_2D;

import javax.swing.*;

public class MinimumPathSumMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};
//        int n = arr.length;
        Integer[][] dp = new Integer[arr.length][arr[0].length];
        int m = arr[0].length;
        System.out.println(check(arr,0,m,0,dp));
    }
    static int check(int[][] arr, int index, int m, int i, Integer[][] dp){
        if (i<0||i>=m){
            return (int) 1e7;
        }
        if(index== arr.length-1){
            return arr[index][i];
        }
        if (dp[index][i]!=null){
            return dp[index][i];
        }
        int left = arr[index][i]+check(arr, index+1, m, i-1,dp);
        int down = arr[index][i]+check(arr, index+1, m, i,dp);
        int up = arr[index][i]+check(arr, index+1, m, i+1,dp);
        return dp[index][i]=Math.min(Math.min(left,down),up);
    }
}
