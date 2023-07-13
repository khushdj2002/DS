package Others.PlacementTraining;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int v = sc.nextInt();
        int count = 0;
        for (int i = l; i <=r ; i++) {
            if (i%v==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
