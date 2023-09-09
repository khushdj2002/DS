package Others.TUF2.DP_2D;

public class GridUniquepaths {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        Integer[][] dp = new Integer[m][n];
        System.out.println(check(m-1,n-1,dp));
    }
    static int check(int m,int n,Integer[][] dp){
        if (m==0&&n==0){
            return 1;
        }
        if(m<0||n<0){
            return 0;
        }
        if (dp[m][n]!=null){
            return dp[m][n];
        }
        int up = check(m-1,n,dp);
        int left = check(m,n-1,dp);
        return dp[m][n]=up+left;
    }
}
