package Others.TUF2.Subsequence;

public class KnapSack {
    public static void main(String[] args) {
        int[] wt ={1,2,4,5};
        int[] val = {5,4,8,6};
        int w = 5;
        Integer dp [][] = new Integer[wt.length][w+1];
        System.out.println(check(0,wt,val,w,dp));
    }
    static int check(int index,int[] wt,int[] val,int w,Integer[][] dp){
        if(w==0||index==wt.length){
            return 0;
        }
        if (dp[index][w]!=null){
            return dp[index][w];
        }
        int take =0;
        int not_take = check(index+1, wt, val, w,dp);
        if(w>=wt[index]){
            take=val[index]+check(index+1, wt, val, w-wt[index],dp);
        }
        return dp[index][w] = Math.max(take,not_take);
    }
}
