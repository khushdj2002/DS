package Others.PlacementTraining;

import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  r = sc.nextInt();
        int unit = sc.nextInt();
        int product = r*unit;
        int n =sc.nextInt();
        int[] arr = new int[n];
        if(arr.length==0){
            System.out.println("-1");
        }
        else {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                product = product - arr[i];
                if (product <= 0) {
                    System.out.println(i+1);
                    break;
                }
            }
            if (product > 0) {
                System.out.println("0");
            }
        }
    }
}
