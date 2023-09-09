package Others.TUF2.DP_1D;

public class ClimbingStairs3 {
    public static void main(String[] args) {
        int n = 3;
        int prev1 = 1;
        int prev2 = 1;
        for (int i = 2; i < n+1; i++) {
            int temp= prev2;
            prev2 = prev1+prev2;
            prev1=temp;
        }
        System.out.println(prev2);
    }
}
