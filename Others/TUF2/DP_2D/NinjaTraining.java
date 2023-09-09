package Others.TUF2.DP_2D;

public class NinjaTraining {
    public static void main(String[] args) {
        int[][] arr= {{1,2,2},{2,2,1},{2,1,2}};
        int[][] dp = new int[arr.length][4];
        System.out.println(check(arr.length-1,3,arr,dp));
    }
    static int check(int day,int last,int[][]arr,int [][]dp){
        if (day==0){
            int max = 0;
            for (int i = 0; i < 3; i++) {
                if (i!=last){
                    int act = arr[day][i];
                    max=Math.max(act,max);
                }
            }
            return max;
        }
        int maxi=0;
        for (int i = 0; i < 3; i++) {
            if(i!=last){
                int act = arr[day][i]+check(day-1, i, arr, dp);
                maxi=Math.max(maxi,act);
            }
        }
        return maxi;
    }
}
