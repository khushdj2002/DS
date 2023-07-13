package Others.PlacementTraining;

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i]= sc.nextInt();
            System.out.print(arr[i]+"-"+(char)arr[i]+" ");
        }
    }
}
