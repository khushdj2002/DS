package interview;

import Stack.Check;

import javax.swing.*;
import java.util.*;

public class Interview3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int arr[] = new int[n];
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            arr.add(sc.nextInt());
        }
//        Arrays.sort(arr);
        Collections.sort(arr);
        System.out.println(Check(arr));
    }
    static String Check(List<Integer> a){
        Collections.sort(a);
        for (int i = 0; i < a.size()-1; i++) {
            if(a.get(i+1)%a.get(i)!=0){
                return "False";
            }
        }
        return "Yes";
    }
}
