package Others.TUF.DP;

import java.util.Arrays;
import java.util.Scanner;

public class FrogJump4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int check[]  = new int[n];
        Arrays.fill(check,-1);
        fill(check,arr,arr.length-1);
        System.out.println(check[check.length-1]);
    }
    static int fill(int[] check,int[] arr,int n){
        if (n==0){
            return 0;
        }
        if (check[n]!=-1){
            return check[n];
        }
        int left = fill(check,arr,n-1)+Math.abs(arr[n]-arr[n-1]);
        int right = Integer.MAX_VALUE;
        if (n>1){
            right  =fill(check,arr,n-2)+Math.abs(arr[n]-arr[n-2]);
        }
        return check[n]=Math.min(left,right);
    }
}
