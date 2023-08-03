package Others.TUF.Recursion;

import javax.naming.InsufficientResourcesException;
import javax.swing.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Combination_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(combine(arr,target));

    }
    static List<List<Integer>> combine(int[] arr,int target){
        List<List<Integer>> ll = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        int index = 0;
        int sum=0;
        check(ll,arr,target,sum,index,list);
        return ll;
    }
    static void check(List<List<Integer>> ll , int[] arr, int target,int sum,int index,List<Integer> list){
        if (sum==target){
            List<Integer> ab = new LinkedList<>(list);
            Collections.sort(ab);
            if (!ll.contains(ab)) {
                ll.add(ab);
            }
            return;
        }
        if (sum>target||index>=arr.length){
            return;
        }
        list.add(arr[index]);
        check(ll,arr,target,sum+arr[index],index+1,list);
        list.remove(list.size()-1);
        check(ll,arr,target,sum,index+1,list);
    }
}
