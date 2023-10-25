package TopDown;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] dp = new Integer[n+1];
        System.out.println(fibb(n,dp));
    }
    static int fibb(int n,Integer[] dp){
        if (n<2){
            return n;
        }
        if (dp[n]!=null){
            return dp[n];
        }
        return dp[n]=fibb(n-1,dp)+fibb(n-2,dp);
    }
}

