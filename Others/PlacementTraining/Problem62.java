package Others.PlacementTraining;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hmap.put(i,i+1);
        }
        System.out.println(hmap);
        hmap.put(3,hmap.getOrDefault(3,0)+1);
        System.out.println(hmap);
        for (Map.Entry e: hmap.entrySet()){
            System.out.println(e.getValue()+"->"+e.getKey());
        }
    }

}
