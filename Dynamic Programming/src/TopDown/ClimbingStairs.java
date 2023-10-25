package TopDown;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] dp = new Integer[n+1];
        System.out.println(stair(n,dp));
    }
    static int stair(int n,Integer[] dp){
        if (n<3){
            return n;
        }
        if (dp[n]!=null){
            return dp[n];
        }
        return dp[n]=stair(n-1,dp)+stair(n-2,dp);
    }
}
