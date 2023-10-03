package Others.TUF.DP;

public class ShopVisitCost {

    public static void main(String[] args) {
        int[] c = {7,6,5,10,3,2,1};
        int x = 2;
        Integer[][] dp= new Integer[c.length][4];
        System.out.println(c[0]+check(1,c,x,3,dp));
    }
    static int check(int index,int[] c,int x,int count,Integer[][] dp){
        if (index==c.length-1){
            return c[index];
        }
        if (dp[index][count]!=null){
            return dp[index][count];
        }
        int not_take = Integer.MAX_VALUE;
        int take = c[index]+check(index+1, c, x, 3,dp);
        if (count!=0){
            not_take = x+check(index+1, c, x, count-1,dp);
        }
        return dp[index][count]= Math.min(take,not_take);
    }
}
