package Others.TUF.Recursion;

import java.util.*;

public class SubSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        Set<List<Integer>> set = new HashSet<>();
        subset(set,new ArrayList<>(),0,arr);
        List<List<Integer>> li = new ArrayList<>(set);
        System.out.println(li);
    }
    static  void subset(Set<List<Integer>> set, List<Integer> list,int index, int[] arr){
        if(index==arr.length){
            set.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        subset(set,list,index+1,arr);
        list.remove(list.size()-1);
        subset(set,list,index+1,arr);
    }
}
