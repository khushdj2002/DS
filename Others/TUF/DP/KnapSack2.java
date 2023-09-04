package Others.TUF.DP;

public class KnapSack2 {
    public static void main(String[] args) {
        int[] wt = {1,2,4,5};
        int[] val={5,4,8,6};
        int w = 5;
        System.out.println(check(wt,val,wt.length-1,w));
    }
    static int check(int[] wt,int[] val,int index,int w){
        if (index==0){
            return val[index];
        }


        int not_take = check(wt, val, index-1, w);
        int take = 0;
        if (w>=wt[index]){
            take = val[index]+check(wt, val, index-1, w-wt[index]);
        }
        return Math.max(not_take,take);
    }
}
