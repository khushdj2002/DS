package TopDown;

public class KFrogs {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.minimizeCost(4,2,new int[]{10,40,30,10}));
    }
}
class Solution {
    public int minimizeCost(int n, int k, int []height){
        // Write your code here.
        // Integer[] dp = new Integer[n+1];
        // return frog(height.length-1, height, k, dp);

        int[] arr = new int[n];
        arr[0]=0;
        for(int i=1;i<n;i++){

            int min = (int)1e7;
            if(i>=k){
                for(int j=1;j<=k;j++){
                    int jump = Math.abs(height[i]-height[i-j])+arr[i-j];
                    min = Math.min(jump, min);
                }
            }
            else{
                for(int j=i-1;j>=0;j--){
                    int jump = Math.abs(height[i]-height[j])+arr[j];
                    min = Math.min(jump, min);
                }
            }
            arr[i]=min;
        }
        return arr[arr.length-1];
    }
    // static int frog(int index,int[] height, int k,Integer[] dp){
    //     if(index<=0){
    //         return 0;
    //     }
    //     if(dp[index]!=null){
    //         return dp[index];
    //     }
    //     int min = (int)1e7;
    //     for (int i = 1; i <= k; i++) {
    //         if(index>=i){
    //             int jump = frog(index-i, height, k, dp)+Math.abs(height[index]-height[index-i]);
    //             min = Math.min(min, jump);
    //         }
    //     }
    //     return dp[index]=min;
    // }
}

