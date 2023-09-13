package Others.TUF3.Sorting;


import java.util.Arrays;

/*
    Selection sort  select minimal and swap it with arr[0]. that's it.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int i=0;
        while(i<arr.length-1){
            int k = i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                }
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
