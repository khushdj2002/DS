package Others.TUF.DP;
/*
In this question we find minimum path in  a grid feom starting point to ending point.
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int m = grid.length;
        int  n = grid[0].length;
        int a = (int) 1e3;
        System.out.println(a);
        int dp[][] = new int[grid.length][grid[0].length];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(check(grid,dp,m-1,n-1));
    }
    static int check(int[][] grid,int[][] dp,int m,int n){
        if(m<0||n<0){
            return (int)Math.pow(10,9);
        }
        if(m==0&&n==0){
            return grid[0][0];
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int up = grid[m][n]+check(grid,dp,m-1,n);
        int left = grid[m][n]+check(grid,dp,m,n-1);
        return dp[m][n]=Math.min(up,left);
    }
}
