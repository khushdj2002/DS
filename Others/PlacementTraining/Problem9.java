package Others.PlacementTraining;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = n-1; i >=0; i--) {
            arr[i]=sc.nextInt();
        }


        System.out.println(Arrays.toString(arr));
    }
}
