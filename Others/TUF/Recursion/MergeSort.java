package Others.TUF.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        merge(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void merge(int[] arr,int low,int high){
        if(low==high){
            return;
        }
        int mid = (low+high)/2;
        merge(arr,low,mid);
        merge(arr,mid+1,high);
        mergeAdd(arr,low,mid,high);
    }
    static void mergeAdd(int[] arr,int low,int mid,int high){
        int temp[] = new int[high-low+1];
        int i=0;
        int left = low;
        int right = mid+1;
        while(left<=mid&&right<=high){
            if (arr[left]<=arr[right]){
                temp[i]=arr[left];
                i++;
                left++;
            }
            else{
                temp[i] = arr[right];
                i++;
                right++;
            }
        }
        while (left<=mid){
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=high){
            temp[i]=arr[right];
            right++;
            i++;
        }
        int k=0;
        for (int j = low; j <= high; j++) {
            arr[j]=temp[k];
            k++;
        }
    }
}
