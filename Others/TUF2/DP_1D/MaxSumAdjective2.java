package Others.TUF2.DP_1D;

public class MaxSumAdjective2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,3,5,8,1,9};
        int[] dp = new int[arr.length];
        dp[0]=arr[0];
        for (int i = 1; i < dp.length; i++) {
            int take =arr[i];
            if(i>1){
                take += dp[i-2];
            }
            int not_take = arr[i];
            dp[i]=Math.max(take,not_take);
        }
        System.out.println(dp[dp.length-1]);
    }
}
