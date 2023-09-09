package Others.TUF2.Subsequence;

public class SubSetSumEqual {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 4;
        System.out.println(check(arr,target,arr.length-1));
    }
    static boolean check(int[] arr,int target,int index){
        if(index==0){
            return arr[0]==target;
        }
        if (target==0){
            return true;
        }
        boolean takee = check(arr,target-arr[index],index-1);
        boolean not_take =check(arr, target, index-1);
        return takee|| not_take;
    }
}
