package Others.TUF.Recursion;

// The subsequence is contigious or non-contigious sequence which follows the order.
// The value is 2^n number of data.
// This can be achieved from paul set also but here we do in recursion.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
    Pseudo code
    f(ind , list){
        if(ind>=list.length){
            return list;
        }
        list.add(arr[i]);
        f(ind+1,list);
        list.remove(arr[i]);
        f(ind+1,list);
    }
 */
public class SubSequence {
    static LinkedList<LinkedList<Integer>> ab = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
//        List<Integer> list = new ArrayList<>();

        LinkedList<Integer> list = new LinkedList<>();
        subseq(list,arr,0);
        System.out.println(ab);
    }
    static void subseq(LinkedList<Integer> list,int[] arr,int index){
        if (index>= arr.length){
            LinkedList<Integer> xy = new LinkedList<>(list);
            if(xy.size()==2) {
                ab.add(xy);
            }
            return;
        }
        list.add(arr[index]);
        subseq(list,arr,index+1);
        list.remove(list.indexOf(arr[index]));
        subseq(list,arr,index+1);
    }
}
