package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_example {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        hmap.put(1, 2);
        hmap.put(2, 4);
        hmap.put(3, 6);
        hmap.put(4, 8);
        hmap.put(5, 10);
        if (hmap.containsValue(6)){
            System.out.println("True");
        }
        System.out.println(hmap.get(2));
        System.out.println(hmap);
        System.out.println("set Entry "+hmap.entrySet());
        System.out.println("keySet() "+hmap.keySet());
        hmap.remove(2);
        hmap.putIfAbsent(2,4);
        hmap.put(3,5);// If duplicate is added then previous one will be overridden.
        for (Map.Entry m : hmap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("hello");

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(6,12);
        map.putAll(hmap);
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+"  "+m.getValue());
        }
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }
        map.replace(3,6);
        System.out.println(map);
        hmap.replaceAll((k,v)->6);
        System.out.println(hmap);



        String sb = "hii";
        String a = "hi";
        if(sb.contains(a)){
            System.out.println("true");
        }

        int arr [] = new int[5];
        
    }
}
