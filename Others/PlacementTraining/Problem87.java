package Others.PlacementTraining;

import java.util.ArrayList;
import java.util.List;

public class Problem87 {
    static int mi;
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,nums));
    }
    static public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum == target) {
                if ((i - j) < min) {
                    min = i - j;
                }
            }
            if (sum > target) {
                sum = sum - nums[j];
                j++;
            }
            if (sum == target) {
                if ((i - j) < min) {
                    min = i - j;
                }
            }
        }
        return min;
    }
}
