package Map.HashMap;

import java.util.HashMap;

public class Problem2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hmap.put(i,i+1);
        }
        System.out.println(hmap);
        hmap.put(4,hmap.getOrDefault(4,1)+1);
        hmap.put(11,hmap.getOrDefault(11,0)+1);
        System.out.println(hmap);
    }

}
