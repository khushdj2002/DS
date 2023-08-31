package Others.TUF.DP;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfNonAdj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int[] ch = new int[n];
        Arrays.fill(ch,-1);
        System.out.println(getMax(arr,ch,n-1));
    }
    static int getMax(int[] arr,int[] ch,int n){
        if (n==0){
            return arr[0];
        }
        if (n<0){
            return 0;
        }
        if (ch[n]!=-1){
            return ch[n];
        }
        int left = arr[n]+getMax(arr,ch,n-2);
        int right = getMax(arr, ch, n-1);
        return ch[n]=Math.max(left,right);
    }
}
