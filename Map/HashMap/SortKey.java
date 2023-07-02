package Map.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class SortKey {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(5,6);
        map.put(3,10);
        map.put(1000,12);
        map.put(7,13);
        map.put(100,15);
        map.put(8,3);

        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);
//        System.out.println(Arrays.toString(keys));
        for (Object key :
                keys) {
            int a= (int) key;
            System.out.println(key+"  "+map.get(key));
        }

        System.out.println(map);
    }
}
