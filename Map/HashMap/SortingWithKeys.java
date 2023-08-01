package Map.HashMap;

import java.util.*;

public class SortingWithKeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> hmap = new HashMap<>();

        hmap.put(3,4);
        hmap.put(4,4);
        hmap.put(37,4);
        hmap.put(36,4);
        hmap.put(31,4);
        hmap.put(20,4);
        hmap.put(25,4);
        hmap.put(41,4);
        hmap.put(2,9);
//        System.out.println(hmap);
        LinkedList<Integer> list = new LinkedList<>();
        for(Map.Entry e : hmap.entrySet()){
            list.add((int) e.getKey());
            System.out.println(e.getKey()+" -> "+e.getValue());
        }

        Collections.sort(list);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" -> "+hmap.get(list.get(i)));
        }

    }
}
