package Others.TUF.DP;

public class MatrixPrint {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][]dp = new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                if (i==0&&j==0){
                    dp[0][0]=1;
                }
                else {
                    int up=0,left=0;
                    if (i>0){
                        up=dp[i-1][j];
                    }
                    if (j>0){
                        left=dp[i][j-1];
                    }
                    dp[i][j]=left+up;
                }
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}
