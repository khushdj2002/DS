package Others.TUF3.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n=0;
        while (n!= arr.length-1){
            int min = n;
            for (int i = n+1; i < arr.length; i++) {
                if (arr[i]<arr[min]){
                    min=i;
                }
            }
            int temp = arr[n];
            arr[n]  = arr[min];
            arr[min] = temp;
            n++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
