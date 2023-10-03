package Others.TUF3.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        merge(arr,0, arr.length-1, arr.length/2 );

    }
    static void merge(int[] arr,int left,int right,int pivot){
        if (left>=right){
            return;
        }
        while (arr[pivot]>arr[left]){
            left++;
        }
        while (arr[pivot]<arr[right]){
            right--;
        }
        /*
        29
6 3 14 18 8 18 4 3 12 1 14 7 9 22 11 28 24 22 30 13 2 19 8 8 18 14 11 13 1

         */

    }
}
