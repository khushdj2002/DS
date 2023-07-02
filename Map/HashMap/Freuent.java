package Map.HashMap;

import java.util.Collections;
import java.util.HashMap;

public class Freuent {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hmap= new HashMap<>();
        int arr[] = {5,1,2,1,3,4,1};
        for (int i = 0; i < arr.length; i++) {
            if (hmap.containsKey(arr[i])){
                int a = hmap.get(arr[i]);
                hmap.replace(arr[i],++a );
            }
            else {
                hmap.put(arr[i],1 );
            }
        }
//        Collections.sort();
        System.out.println(hmap.size());
        System.out.println(hmap);
    }
}
