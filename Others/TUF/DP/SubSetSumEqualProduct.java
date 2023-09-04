package Others.TUF.DP;

public class SubSetSumEqualProduct {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0};
        int target = 4;
        System.out.println(check(arr,0,0,target));
    }
    static  boolean check(int[] arr,int index,int sum,int target){
        if (sum==target){
            return true;
        }
        if(index==arr.length){
            return false;
        }
        boolean take=false,not_take=false;
        if (target>=(sum+arr[index])){
             take = check(arr, index+1, sum+arr[index], target);
        }
         not_take = check(arr, index+1, sum, target);
        if (take||not_take){
            return true;

        }
        return false;
    }
}
