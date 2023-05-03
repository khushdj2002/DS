package CP;

import java.util.*;
import java.util.Scanner;

public class HashString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        String s = new String(b.toLowerCase());
        HashMap<Character,Integer> hMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                continue;
            }
            if(hMap.containsKey(s.charAt(i))){
                int a=hMap.get(s.charAt(i));
                hMap.remove(s.charAt(i));
                ++a;
                hMap.put(s.charAt(i), a);
            }
            else{
                hMap.put(s.charAt(i), 1);
            }
        }
        // System.out.println(hMap);

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(hMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o1.getValue()- o2.getValue();
            }
        });
        LinkedList<Character> ab = new LinkedList<>();
        String x="";
        int c=-1;
        for (Map.Entry<Character,Integer> e: list){
            // System.out.println(e.getKey()+"="+e.getValue());
            if(ab.size()==0){
                c=e.getValue();
                ab.add(e.getKey());
            }
            else if(c==e.getValue()){
                ab.add(e.getKey());
            }
            else{
                Collections.sort(ab);
                // System.out.println(ab);
                for (int index = ab.size()-1; index >=0; index--) {
                    x+=ab.get(index);
                }
                // x=x+ab.toString();
                ab=new LinkedList<>();
                c=e.getValue();
                ab.add(e.getKey());
            }
        }
        Collections.sort(ab);
        for (int jindex = ab.size()-1; jindex >=0; jindex--) {
            x+=ab.get(jindex);
        }
        StringBuilder sb = new StringBuilder(x);
        System.out.println(sb.reverse().toString());
    }
}
