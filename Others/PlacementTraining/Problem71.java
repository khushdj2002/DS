package Others.PlacementTraining;

import java.util.Scanner;

public class Problem71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int xl = sc.nextInt();
        int yl = sc.nextInt();
        int R = sc.nextInt();
        int count =0;
        for (int i = x1; i <=x2 ; i++) {
            for (int j = y1; j <=y2 ; j++) {
                if (Math.sqrt(Math.pow((xl-i),2)+Math.pow((yl-j),2))<=R){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
