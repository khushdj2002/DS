package Others.TUF2.DP_2D;

public class MinimumSumInaGrip {
    public static void main(String[] args) {
        int[][] arr = {{5,9,6},{11,5,2}};
        int m = arr.length;
        int n = arr[0].length;
        Integer[][] dp = new Integer[m][n];
        System.out.println(check(arr,m-1,n-1,dp));

    }
    static int check(int[][] arr,int m,int n,Integer[][] dp){
        if (m==0&&n==0){
            return arr[m][n];
        }
        if (m<0||n<0){
            return (int)1e7;
        }
        if (dp[m][n]!=null){
            return dp[m][n];
        }
        int up = arr[m][n]+check(arr, m-1, n,dp);
        int left = arr[m][n]+check(arr, m, n-1,dp);
        return dp[m][n]=Math.min(up,left);
    }
}
