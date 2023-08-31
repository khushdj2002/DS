package Others.TUF.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Print all unique ways of subarray.
 */

public class SubSet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        subSet(list,new ArrayList<>(),0,arr);
        System.out.println(list);
    }
    static void subSet(List<List<Integer>> list , List<Integer> li,int index,int[] arr){
        list.add(new ArrayList<>(li));
        System.out.println(li);
        for (int i = index; i < arr.length; i++) {
            if(i!=index&&arr[i]==arr[i-1])
                continue;
            li.add(arr[i]);
            subSet(list,li,i+1,arr);
            li.remove(li.size()-1);
        }
    }
}
