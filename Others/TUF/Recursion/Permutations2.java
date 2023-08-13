package Others.TUF.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> list = new ArrayList<>();
        permu(list,new ArrayList<>(),0,arr);
        System.out.println(list);
    }
    static void swap(int i,int j, int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static  void permu(List<List<Integer>> list, List<Integer> li, int index,int[] arr){
        if (index== arr.length){
            li = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                li.add(arr[i]);
            }
            System.out.println(li);
            list.add(new ArrayList<>(li));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(i,index,arr);
            permu(list,li,index+1,arr);
            swap(i,index,arr);
        }
    }
}
