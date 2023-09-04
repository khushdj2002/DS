package Others.TUF.DP;

public class SubSetSumEqualProduct2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target=4;
        Boolean dp[][] = new Boolean[arr.length][target+1];
        System.out.println(check(arr,target,arr.length-1,dp));
    }
    static boolean check(int[] arr,int target,int index,Boolean[][] dp){
        if (target==0){
            return true;
        }
        if (index<0){
//            if (arr[index]==target) {
//                return true;
//            }
            return false;
        }
        if(dp[index][target]!=null){
            return dp[index][target];
        }
        boolean not_take = check(arr, target, index-1,dp);
        boolean take = false;
        if (target>=arr[index]){
            take=check(arr, target-arr[index], index-1,dp);
        }
        return dp[index][target]=take||not_take;
    }
}
