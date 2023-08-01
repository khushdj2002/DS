package Others.PlacementTraining;
import java.util.Scanner;
public class Problem51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSubsets(arr,m));
    }
    static String findSubsets(int[] nums,int m) {
        int n = nums.length;
        for (int i = 0; i < (1 << n); i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    count = count + nums[j];
                    if (count == m) {
                        return "Yes";
                    }
                }
            }

        }
        return "No";
    }
}
