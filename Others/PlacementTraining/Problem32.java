package Others.PlacementTraining;

import java.util.Arrays;
import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i]*(i+1);

        }
        System.out.println(sum);
    }
}
