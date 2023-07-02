package Map.HashMap;

import java.util.*;


public class SortingByValue {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(1,100);
        hmap.put(2,20);
        hmap.put(3,40);
        hmap.put(4,10);
        hmap.put(5,50);

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hmap.entrySet());
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(0);
        ll.add(3);
        System.out.println(ll);
        ll.remove(0);

        LinkedList<Integer> lm = new LinkedList<>(ll);
        System.out.println(lm);
        Collections.sort(lm);
        System.out.println(lm);
        System.out.println(ll);
        ll.remove(ll.get(0));
        System.out.println(ll);
        ll=new LinkedList<>(lm);
        System.out.println(ll);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue()- o2.getValue();
            }
        });
        for (Map.Entry<Integer,Integer> e: list){
            System.out.println(e.getKey()+"="+e.getValue());
        }
    }
}
