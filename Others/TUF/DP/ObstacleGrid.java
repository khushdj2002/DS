package Others.TUF.DP;

public class ObstacleGrid {
    public static void main(String[] args) {
        int[][] obs = {{0,0,0},{0,1,0},{0,0,0}};
        int [][] dp = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
        System.out.println(check(obs, obs.length-1, obs[0].length-1,dp));
    }
    static  int check(int[][] obs,int m,int n,int[][] dp){
        if(m<0||n<0){
            return 0;
        }
        if(obs[m][n]==1){
            return 0;
        }
        if(m==0&&n==0){
            return 1;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int up = check(obs,m-1,n,dp);
        int left = check(obs,m,n-1,dp);
        return dp[m][n]=up+left;

    }
}
