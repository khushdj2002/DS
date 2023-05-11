package CP;

import java.util.*;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        
        HashMap<String,Integer> hMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String sa = arr[i];
            if(hMap.containsKey(sa)){
                int a = hMap.get(sa);
                hMap.remove(sa);
                hMap.put(sa, ++a);
            }
            else{
                hMap.put(sa,1);
            }
        }
        System.out.println(hMap);
        List<Map.Entry<String,Integer>> list = new ArrayList<>(hMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()- o2.getValue();
            }
        });
        LinkedList<Integer> ll = new LinkedList<>();
        HashMap<Integer,String> map = new HashMap<>();
        int a=0;
        for (Map.Entry<String,Integer> e: list){
            if(ll.size()==0){
                a=e.getValue();
                ll.add(e.getKey().length());
                map.put(e.getKey().length(),e.getKey());
            }
            else if(a==e.getValue()){
                ll.add(e.getKey().length());
                map.put(e.getKey().length(),e.getKey());
            }
            else{
                Collections.sort(ll);
                for (int i = 0; i < ll.size(); i++) {
                    System.out.println(map.get(ll.get(i))+" - "+a);
                }
                ll = new LinkedList<>();
                a=e.getValue();
                ll.add(e.getKey().length());
                map= new HashMap<>();
                map.put(e.getKey().length(),e.getKey());
            }
            // System.out.println(e.getKey()+"="+e.getValue());
        }
        
    }
}
