package Others.TUF2.String;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "abcjklp";
        String s3 = "acjkp";
        int[][] dp = new int[s1.length()+1][s3.length()+1];
        for(int[] e: dp ){
            Arrays.fill(e,-1);
        }
        System.out.println(check(s1,s3,s1.length()-1,s3.length()-1,dp));
        for(int[] e:dp){
            System.out.println(Arrays.toString(e));
        }

        StringBuilder sb = new StringBuilder();
        int m = dp.length-1;
        int n = dp[0].length-1;
        while (dp[m][n]>0){
            if (dp[m][n]==dp[m-1][n]){
                m=m-1;
            } else if (dp[m][n]==dp[m][n-1]) {
                n=n-1;
            }
            else{
                sb.append(s1.charAt(m-1));
                if(dp[m-1][n]>dp[m][n-1]){
                    m--;
                }
                else{
                    n--;
                }
            }
        }
        System.out.println(sb.reverse().toString());
        

    }
    static int check(String s1,String s2,int m,int n,int[][] dp){
        if(m<0||n<0){
            return 0;
        }
        if (dp[m+1][n+1]!=-1){
            return dp[m+1][n+1];
        }
        int take=0;
        int not_take=0;
        if(s1.charAt(m)==s2.charAt(n)){
             take = 1+check(s1,s2,m-1,n-1,dp);
        }
        else{
             not_take = Math.max(check(s1, s2, m-1, n,dp),check(s1, s2, m, n-1,dp));
        }
        return dp[m+1][n+1]= take+not_take;
    }
}
