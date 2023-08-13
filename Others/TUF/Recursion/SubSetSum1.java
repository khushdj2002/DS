package Others.TUF.Recursion;

import java.util.*;

public class SubSetSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        List<Integer> ll = new ArrayList<>();
        search(ll,new ArrayList<>(),0,0,arr);
        Collections.sort(ll);
        System.out.println(ll);
    }
    static void search(List<Integer> ll,List<Integer> list,int sum,int index,int[] arr){
        if (index== arr.length){
            ll.add(sum);
            return;
        }
        list.add(arr[index]);
        search(ll,list,sum+arr[index],index+1,arr);
        list.remove(list.size()-1);
        search(ll,list,sum,index+1,arr);
    }
}
