package Others.TUF2.DP_1D;

public class FrogJumpK_Steps2 {
    public static void main(String[] args) {
        int[] arr = {30,10,60,10,60,50};
        int [] dp = new int[arr.length];
        dp[0]=0;
        int k=2;
        for (int i = 1; i < arr.length ; i++) {
            int mmsteps =Integer.MAX_VALUE;
            for (int j = 1; j <=k ; j++) {
                if(i-j>=0){
                    int jump = dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                    mmsteps = Math.min(mmsteps,jump);
                }
            }
            dp[i]=mmsteps;
        }
        System.out.println(dp[dp.length-1]);
    }
}
