package Others.TUF.DP;

public class PartitionArrayMinimum {
    public static void main(String[] args) {
        int[] arr = {2,-1,0,4,-2,-9};
        int sum=0;
        for (int i = 1; i < arr.length; i++) {
            sum+=arr[i];
        }
        Boolean[][] dp = new Boolean[arr.length][Math.abs(sum)];
        System.out.println(check(arr,sum, arr.length-1, dp));
    }
    static boolean check(int[] arr,int sum,int index,Boolean[][] dp){
        if (index>arr.length){
            return false;
        }
        if(dp[index][Math.abs(sum)]!=null){
            dp[index][Math.abs(sum)]=true;
        }
        boolean not_take = check(arr, sum, index+1, dp);
        boolean take = check(arr, sum+arr[index+1], index+1, dp);

        return dp[index][Math.abs(sum)]==not_take||take;
    }
}
