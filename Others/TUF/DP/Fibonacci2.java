package Others.TUF.DP;

import java.util.Arrays;

public class Fibonacci2 {
    public static void main(String[] args) {
        int n=5;
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        System.out.println(getFib(n,arr));
    }
    static int getFib(int n,int[] arr){
        if (n<=1){
            return n;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        return arr[n]=getFib(n-1,arr)+getFib(n-2,arr);
    }
}
