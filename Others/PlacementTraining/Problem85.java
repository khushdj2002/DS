package Others.PlacementTraining;

import java.util.Scanner;

public class Problem85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//            int n = sc.nextInt();
        System.out.println(search(100));


    }
    static int search(int n){
        int x = n*2;
        while (x<=1000000) {
            int sum = 0;
            for (int i = x; i > 0; i = i / 10) {
                sum = sum + i % 10;
            }
            if (sum == n) {
                return x;
            }
            x = x + n;
        }
    return -1;
    }
}
