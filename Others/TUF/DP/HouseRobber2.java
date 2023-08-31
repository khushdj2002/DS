package Others.TUF.DP;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int[] ch = new int[n];
        int[] ch1 = new int[n];
        Arrays.fill(ch,-1);
        Arrays.fill(ch1,-1);
        int left = subselect(arr,n-1,ch);
        int right = subselect1(arr,n-1,ch);
        System.out.println(Math.max(left,right));
    }
    static int subselect(int[] arr,int n,int[] ch){
        if (n==0){
            return arr[0];
        }
        if (n<0){
            return 0;
        }
        if (ch[n]!=-1){
            return ch[n];
        }
        int pick = arr[n]+subselect(arr, n-2, ch);
        int not_pick = subselect(arr, n-1, ch);
        return ch[n]=Math.max(pick,not_pick);
    }
    static int subselect1(int[] arr,int n,int[] ch1){
        if (n==1){
            return arr[1];
        }
        if (n<1){
            return 0;
        }
        if (ch1[n]!=-1){
            return ch1[n];
        }
        int pick = arr[n]+subselect(arr, n-2, ch1);
        int not_pick = subselect(arr, n-1, ch1);
        return ch1[n]=Math.max(pick,not_pick);
    }
}
