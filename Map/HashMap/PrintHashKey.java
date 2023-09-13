package Map.HashMap;

import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PrintHashKey {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(3,4);
        hmap.put(4,5);
        hmap.put(5,6);
        hmap.put(6,7);
        hmap.put(7,8);
        hmap.put(8,9);
        System.out.println(hmap);
        Set<Integer> set = hmap.keySet();

        hmap.remove(3);
        System.out.println(set.iterator().next());
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.remove(set.iterator().next());
        System.out.println(set);
        System.out.println(hmap);
        System.out.println(set.contains(6));

    }
}
