package Map.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int m=sc.nextInt();
            if (hmap.containsKey(m)){

            }
            else {
                hmap.put(m,a);
                a++;
            }
        }
        Object[]  keys = hmap.keySet().toArray();
        Arrays.sort(keys);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            for (Object key : keys) {
                if((int) key<arr[i]&& hmap.get(key)!=1){
                    continue;
                }
                if ((int)key > arr[i]) {
                    System.out.println(hmap.get(key)+1);
                    break;
                }
                else {
                    System.out.println(hmap.get(key));
                    break;
                }

//                System.out.println(key + "  " + hmap.get(key));
            }

        }
        System.out.println(hmap);
    }
}
