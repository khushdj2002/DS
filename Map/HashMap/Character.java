package Map.HashMap;

import java.util.HashMap;

public class Character {
    public static void main(String[] args) {
        String s ="ABAB";
        int k=2;
        HashMap<java.lang.Character, Integer> hmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i),i);
            }
            else {
                hmap.put(s.charAt(i),i);
            }
        }
        System.out.println(hmap);
    }
}
