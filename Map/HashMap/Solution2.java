package Map.HashMap;

import java.io.*;
import java.util.*;
class Result {
    public static long stockmax(List<Integer> prices) {
        // Write your code here
        HashMap<Integer,HashMap<Integer,Integer>> a = new HashMap<>();
        int max = prices.get(0);
        HashMap h = new HashMap<>();
        h.put(max, max);
        a.put(0, h);
        for(int i=1;i<prices.size();i++){
            if(prices.get(i)>max){
                max = prices.get(i);
                for (int j = 0; j < i; j++) {
                    HashMap<Integer,Integer> hma = new HashMap<>();
                    int m = Math.max(a.get(j).get(prices.get(j)),max);
                    hma.put(prices.get(j), m);
                    a.put(j, hma);
                }
                HashMap<Integer, Integer> hma = new HashMap<>();
                hma.put(prices.get(i), prices.get(i));
                a.put(i, hma);
            }
            else {
                HashMap<Integer, Integer> hma = new HashMap<>();
                hma.put(prices.get(i), prices.get(i));
                a.put(i, hma);
                max=prices.get(i);
            }
        }
        long count = 0;
        for(Map.Entry<Integer,HashMap<Integer,Integer>> e : a.entrySet()){
            for(Map.Entry<Integer,Integer> hi : e.getValue().entrySet()){
                count = count+(hi.getValue()-hi.getKey());
                System.out.println(count);
            }
        }
        return count;

    }

}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = sc.nextInt();



            List<Integer> prices = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int pricesItem = sc.nextInt();
                prices.add(pricesItem);
            }

            long result = Result.stockmax(prices);
            System.out.println(result);

        }


    }
}
