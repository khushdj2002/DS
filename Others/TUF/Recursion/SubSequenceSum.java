package Others.TUF.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSequenceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        printSub(arr,sum,0,0,list);
    }
    static boolean printSub(int[] arr,int sum,int index,int count,List<Integer> list){
        if (index>= arr.length) {
            if (sum == count) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[index]);
        if (printSub(arr,sum,index+1,count+arr[index],list)){
            return true;
        }
        list.remove(list.size()-1);
        return printSub(arr, sum, index + 1, count, list);
    }
}
