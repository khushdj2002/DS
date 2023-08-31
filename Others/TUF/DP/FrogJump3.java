package Others.TUF.DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FrogJump3 {
    static int max= Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        getFrog(arr,0,0);
        System.out.println(max);
    }
    static void getFrog(int[] arr,int index,int sum){
        if (index==arr.length-1){
            if (sum<max){
                max=sum;
            }
            return;
        }
        if (index+1> arr.length){
            return;
        }
        getFrog(arr,index+1,sum+Math.abs(arr[index]-arr[index+1]));
        if (index+2>=arr.length){
            return;
        }
        getFrog(arr,index+2,sum+Math.abs(arr[index]-arr[index+2]));
    }
}
