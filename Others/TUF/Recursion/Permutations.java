package Others.TUF.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> list = new ArrayList<>();
        permu(list,new ArrayList<>(),arr);
        System.out.println(list);
    }
    static void permu(List<List<Integer>> list, List<Integer> li,int[] arr){
        if (li.size()== arr.length){
            list.add(new ArrayList<>(li));
        }
        for (int i = 0; i < arr.length; i++) {
            if (li.contains(arr[i])){
                continue;
            }
            li.add(arr[i]);
            permu(list,li,arr);
            li.remove(li.size()-1);
        }
    }
}
