package Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Merge_2D {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3},{3,4}};
        int[][] arr2 = {{1,2},{2,3},{3,4}};
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (hmap.containsKey(arr1[i][0])){
                int a = hmap.get(arr1[i][0]);
                hmap.replace(arr1[i][0],a+arr1[i][1]);
            }
            else{
                hmap.put(arr1[i][0],arr1[i][1]);
            }
        }
        System.out.println(hmap.size());
        System.out.println();
        for (Map.Entry<Integer,Integer> e: hmap.entrySet()){

        }

    }
}
