package Others.TUF.DP;

import java.util.Arrays;

public class PrintLCS {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "bdgek";
        int[][] dp = new int[s1.length()][s2.length()];
        for(int[] e: dp){
            Arrays.fill(e,-1);
        }
        System.out.println(check(s1,s2,s1.length()-1,s2.length()-1,dp));

        for(int[] e:dp){
            System.out.println(Arrays.toString(e));
        }
        StringBuilder sb = new StringBuilder();
        int k = dp[dp.length-1][dp[0].length-1];
        int m = dp.length-1;
        int n = dp[0].length-1;
        while(k!=0){
            if(s1.charAt(m)==s2.charAt(n)){
                sb.append(s1.charAt(m));
                if (m!=0) {
                    m--;
                }
                if (n!=0) {
                    n--;
                }
                k=dp[m][n];
            }
            else{
                if(s1.charAt(m-1)==s2.charAt(n)){
                    if (m!=0) {
                        m--;
                    }
                    k=dp[m][n];
                }
                else{
                    if (n!=0) {
                        n--;
                    }
                   k=dp[m][n];
                }
            }

        }
        System.out.println(sb);


    }
    static int check(String s1,String s2,int m,int n,int[][] dp){
        if (m<0||n<0){
            return 0;
        }
        if (dp[m][n]!=-1){
            return dp[m][n];
        }
        if(s1.charAt(m)==s2.charAt(n)){
            return dp[m][n]=1+check(s1, s2, m-1, n-1,dp);
        }
        else{
            return dp[m][n] =Math.max(check(s1, s2, m-1, n,dp),check(s1, s2, m, n-1,dp));
        }
    }
}
