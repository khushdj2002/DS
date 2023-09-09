package Others.TUF2.Subsequence;

public class CountSubSetsWithSum {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int target =3;
        Integer[][] dp = new Integer[arr.length][target+1];
        System.out.println(check(arr,target,arr.length-1,dp));
    }
    static int check(int[] arr,int target,int index,Integer[][] dp){

        if (target==0){
            return 1;
        }
        if (index== 0){
            if(arr[index]==target){
                return 1;
            }
            return 0;
        }
        if (dp[index][target]!=null){
            return dp[index][target];
        }
        int not_take = check(arr, target, index-1,dp);
        int take = 0;
        if (arr[index]<=target){
            take = check(arr, target-arr[index], index-1,dp);
        }

        return dp[index][target]=take+not_take;
    }
}
