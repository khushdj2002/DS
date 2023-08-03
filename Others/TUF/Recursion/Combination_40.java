package Others.TUF.Recursion;

import java.util.*;

public class Combination_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int target = sc.nextInt();
        System.out.println(combine(arr,target));
    }
    static List<List<Integer>> combine(int[] arr,int target){
        List<List<Integer>> ll = new ArrayList<>();
        search(ll,new ArrayList<>(),target,0,arr);
        return ll;
    }
    static void search(List<List<Integer>> ll,List<Integer> list,int target,int index,int [] arr){
        if (target==0){
            ll.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (i>index&&arr[i]==arr[i-1]){
                continue;
            }
            if (arr[i]>target){
                break;
            }
            list.add(arr[i]);
            search(ll,list,target-arr[i],i+1,arr);
            list.remove(list.size()-1);
        }
    }
}
