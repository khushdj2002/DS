package Others.PlacementTraining;

import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int min_i=0;
        int max=0;
        int max_i=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]<min){
                min=arr[i];
                min_i=i;
            }
            if (arr[i]>max){
                max=arr[i];
                max_i=i;
            }
        }
        if (min_i>max_i){
            System.out.println(n-1-min_i+max_i);
        }
        else{
            System.out.println(n-1-min_i+max_i-1);
        }
    }
}
