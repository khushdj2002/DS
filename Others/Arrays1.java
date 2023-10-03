package Others;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,4};
        System.out.println(lengthOfLIS(arr));
    }
    static public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for(int x : nums) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len) len++;
        }
        int[] num = {6, 3, 14, 18, 8, 18, 4, 3, 12, 1, 14, 7, 9, 22, 11, 28, 24, 22, 30, 13, 2, 19, 8, 8, 18, 14, 11, 13, 1,};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        return len;
    }
}
