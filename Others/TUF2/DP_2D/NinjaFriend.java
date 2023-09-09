package Others.TUF2.DP_2D;

public class NinjaFriend {
    public static void main(String[] args) {
        int[][] arr = {{2,3,1,2},{3,4,2,2},{5,6,3,5}};
        int Aj=0;
        int Bj=arr[0].length-1;
        int m = arr[0].length;
        System.out.println(check(arr,0,m,Aj,Bj));
    }
    static int check(int[][] arr,int index,int m,int Aj,int Bj){
        if (Aj<0||Bj<0||Aj>=m||Bj>=m){
            return 0;
        }
        if (index== arr.length-1){
            if (Aj==Bj){
                return arr[index][Aj];
            }
            return arr[index][Aj]+arr[index][Bj];
        }
        int maxi = Integer.MIN_VALUE;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int ans;
                if (Aj==Bj){
                    ans = arr[index][Aj]+check(arr, index+1, m, Aj+i, Bj+j);
                }
                else {
                    ans = arr[index][Aj]+arr[index][Bj]+check(arr, index+1, m, Aj+i, Bj+j);
                }
                maxi = Math.max(maxi,ans);
            }
        }
        return maxi;
    }
}
