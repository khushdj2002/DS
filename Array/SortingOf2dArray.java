package Array;

import java.util.Arrays;
import java.util.Comparator;

public class SortingOf2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,4},{5,9},{2,6},{8,10},{9,11},{15,18},{16,17}};
//        Arrays.sort(arr);
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int[] a:
             arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
