package Others.TUF.DP;

public class UnboundKnapSack {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        int sum = 10;
        System.out.println(check(arr.length-1,arr,sum,0 ));
    }
    static int check(int index,int [] arr,int sum,int count){
        if (index<0){
            return Integer.MIN_VALUE;
        }
        int take = Integer.MIN_VALUE;
        int not_take=check(index-1, arr, sum,count);
        if(sum>=count+arr[index]){
            take = check(index, arr, sum-arr[index],count+arr[index]);
        }
        return Math.max(take,not_take);
    }
}
