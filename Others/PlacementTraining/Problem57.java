package Others.PlacementTraining;

import java.util.Arrays;
import java.util.Scanner;

public class Problem57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]arr = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j]=j;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int l=0;
        int m=3;
        while (true){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    if (l-m==i-j){
                        System.out.print(arr[i][j]);
                    }
                }
            }

            System.out.println();

            if (l==2&&m==0){
                break;
            }
            if (m==0){
                l++;
            }
            else {
                m--;
            }
        }
    }
}
