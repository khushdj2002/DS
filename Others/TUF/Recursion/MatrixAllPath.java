package Others.TUF.Recursion;
/*
In this question is solved in dp it tells that in  a 2d matrix we travel from starting point to ending point what are
the unique ways to do that...
 */
import java.util.Scanner;

public class MatrixAllPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 3;
        int n =3;

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=-1;
            }
        }
        System.out.println(count( m-1,n-1,arr));
    }
    static int count(int m,int n,int[][] dp){
        if (m==0&&n==0){
            return 1;
        }
        if (m<0||n<0){
            return 0;
        }
        if (dp[m][n]!=-1){
            return dp[m][n];
        }
        int up = count(m-1,n,dp);
        int left = count(m,n-1,dp);
        return dp[m][n]=up+left;
    }
}
