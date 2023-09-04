package Others.TUF.DP;

public class RodCutting {
    public static void main(String[] args) {
        int[] rod = {2,5,7,8,10};
        int n = rod.length;
        Integer[][] dp = new Integer[n][n+1];
        System.out.println(check(n-1,rod,n,dp));
    }
    static int check(int index,int[] rod,int N,Integer[][] dp){
        if (index==0){
            return N*rod[0];
        }
        if (dp[index][N]!=null){
            return dp[index][N];
        }
        int not_taken = check(index-1,rod,N,dp);
        int taken = Integer.MIN_VALUE;
        int rodLength = index+1;
        if (N>=rodLength) {
            taken = rod[index] + check(index, rod, N - rodLength,dp);
        }
        return dp[index][N]=Math.max(not_taken,taken);
    }
}
