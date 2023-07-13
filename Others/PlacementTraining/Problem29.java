package Others.PlacementTraining;

import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = 0;
        while (x<=n+m){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(i+j==x) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
            System.out.println();
            x++;
        }
    }
}
