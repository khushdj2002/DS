package Others.TUF.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quick(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] arr,int low,int high){
        if(low<high){
            int pivot = piv(arr,low,high);
            quick(arr,low,pivot-1);
            quick(arr,pivot+1,high);
        }
   }
   static int piv(int[] arr, int low,int high){
        int pivot = low;
        int i = low;
        int j = high;
        while (i<j){
            while (arr[i]<=arr[pivot]&&i<=high-1){
                i++;
            }
            while (arr[j]>=arr[pivot]&&j>=low+1){
                j--;
            }
            if (i<j){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int tem = arr[j];
        arr[j]=arr[pivot];
        arr[pivot]=tem;
        return j;
   }
}
