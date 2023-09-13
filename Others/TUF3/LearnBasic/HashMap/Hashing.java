package Others.TUF3.LearnBasic.HashMap;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        int[] arr= {1,3,2,1,3};
        int[] querry = {1,4,2,3,12};
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hmap.containsKey(arr[i])){
                hmap.put(arr[i],1 );
            }
            else {
                int a = hmap.get(arr[i]);
                a++;
                hmap.put(arr[i],a);
            }
        }
        for (int i = 0; i < querry.length; i++) {
            if (hmap.containsKey(querry[i])){
                System.out.println(hmap.get(querry[i]));
            }
            else{
                System.out.println(0);
            }
        }
        System.out.println(hmap);
    }
}
