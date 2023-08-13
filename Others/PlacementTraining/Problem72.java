package Others.PlacementTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(triplet(arr));
    }
    static List<Integer> triplet(int[] arr){
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if(num<=a){
                a=num;
            } else if (num <= b) {
                b=num;
            }
            else {
                list.add(a);
                list.add(b);
                list.add(num);
                return list;
            }
        }
        return list;
    }
}
