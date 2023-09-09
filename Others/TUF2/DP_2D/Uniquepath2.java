package Others.TUF2.DP_2D;

public class Uniquepath2 {
    public static void main(String[] args) {
        int[][] obs = {{0,0,0},{0,1,0},{0,0,0}};
        int m = obs.length;
        int n = obs[0].length;
        Integer[][] dp = new Integer[m][n];
        System.out.println(check(obs,m-1,n-1,dp));
    }
    static int check(int[][] obs,int m,int  n,Integer[][] dp){
        if (m==0&&n==0){
            return 1;
        }
        if(m<0||n<0){
            return 0;
        }
        if(obs[m][n]==1){
            return 0;
        }
        if (dp[m][n]!=null){
            return dp[m][n];
        }
        int up = check(obs, m-1, n,dp);
        int left = check(obs, m, n-1,dp);
        return dp[m][n]= up+left;
    }
}
