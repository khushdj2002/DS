package Others.TUF2.DP_2D;

public class MinimumPathSumInTraiangle {
    public static void main(String[] args) {
        int arr[][] = {{2},{3,4},{6,5,7},{4,1,8,3}};
        int n = arr.length;
        System.out.println(check(arr,0,0));
    }
    static int check(int[][] arr,int n,int i){
        if (n==arr.length-1){
            return arr[n][i];
        }
        int down = arr[n][i]+check(arr, n+1, i);
        int right = arr[n][i]+check(arr, n+1, i+1);
        return Math.min(down,right);
    }
}
