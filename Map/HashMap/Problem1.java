package Map.HashMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(1,2);
        hmap.put(2,2);
        hmap.put(3,2);
        hmap.put(4,2);
        hmap.put(5,2);
        System.out.println(hmap);
        hmap.getOrDefault(3, hmap.get(3)+1);
        int a = hmap.get(1);
        System.out.println(a);
        for(Map.Entry<Integer,Integer> e : hmap.entrySet()){

        }
        hmap.putIfAbsent(2,6);
        System.out.println(hmap);
    }
}
