package Others;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(peak(arr,0,arr.length));
    }
    static int peak(int[] nums,int start,int end){
        int mid = start+(end-start)/2;
        if (nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
            return mid;
        }
        if (nums[mid]<nums[mid-1]&&nums[mid]>nums[mid+1]){
            return peak(nums,start,mid);
        }
        if (nums[mid]>nums[mid-1]&&nums[mid]<nums[mid+1]){
            return peak(nums,mid,end);
        }
        return 0;
    }
}
