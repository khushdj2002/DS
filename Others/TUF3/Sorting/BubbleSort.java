package Others.TUF3.Sorting;


import java.util.Arrays;

/*
It does opposite of selection sort
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length-1;
        while (n!=0){
            for (int i = 0; i < n; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;
                }
            }
            n--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
