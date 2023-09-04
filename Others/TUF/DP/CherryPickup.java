package Others.TUF.DP;

public class CherryPickup {
    public static void main(String[] args) {
        int[][] arr = {{2,3,1,2},{3,4,2,2},{5,6,3,5}};
        Integer[][][] dp = new Integer[arr.length][arr[0].length][arr[0].length];
        System.out.println(check(arr,0,0,arr[0].length-1,dp));

    }
    static  int check(int[][] arr, int i, int j1, int j2, Integer[][][] dp){
        if(j1<0||j2<0||j1>=arr[0].length||j2>=arr[0].length){
            return (int)-1e7;
        }
        if(i==arr.length-1){
            if (j1==j2){
                return arr[i][j1];
            }
            else {
                return arr[i][j1]+arr[i][j2];
            }
        }
        if (dp[i][j1][j2]!=null){
            return dp[i][j1][j2];
        }
        int maxi = Integer.MIN_VALUE;
        for (int j = -1; j <2 ; j++) {
            for (int k = -1; k < 2; k++) {
                int ans;
                if(j1==j2){
                    ans=arr[i][j1]+check(arr, i+1, j1+j, j2+k,dp);
                }
                else {
                    ans=arr[i][j1]+arr[i][j2]+check(arr, i+1, j1+j, j2+k,dp);
                }
                maxi=Math.max(ans,maxi);
            }
        }
        return dp[i][j1][j2]=maxi;
    }
}
