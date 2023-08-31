package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List2Array {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            List<Integer> li = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                li.add(j+2);
            }
            list.add(li);
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0).size());
        int[][] arr = new int[list.size()][list.get(0).size()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = list.get(i).get(j);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
