package Others.TUF.DP;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=-1;
        }
        System.out.println(fibb(arr,n));
    }
    static int fibb(int[] arr,int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        if (arr[n]!=-1){
            return arr[n];
        }
        arr[n] = fibb(arr,n-1)+fibb(arr,n-2);
        return arr[n];
    }
}
