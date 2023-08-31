package Others.TUF.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
        /*
        It prints all the subsequence of an array.;
         */
public class SubSetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(sumsub(arr));


    }
    static List<List<Integer>> sumsub(int[] arr){
        List<List<Integer>> ll = new ArrayList<>();
        sets(ll,new ArrayList<>(),0,0,arr);
        return ll;
    }
    static void sets(List<List<Integer>> ll,List<Integer> list,int index,int sum,int[] arr){
        if (index== arr.length){
            ll.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        sets(ll,list,index+1,sum+arr[index],arr);
        list.remove(list.size()-1);
        sets(ll,list,index+1,sum,arr);
    }
}
