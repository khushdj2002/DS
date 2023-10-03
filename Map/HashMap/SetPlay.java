package Map.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetPlay {
    public static void main(String[] args) {
        HashMap<Integer, Set<Integer>> hmap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            hmap.put(i,new HashSet<>());
        }

    }
}
