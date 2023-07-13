package Others.PlacementTraining;

import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(target-arr[0]);
        }


    }
}
