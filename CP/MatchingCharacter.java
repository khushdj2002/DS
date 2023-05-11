package CP;

import java.util.*;

public class MatchingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character,Integer> hmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                continue;
            }
            if(hmap.containsKey(s.charAt(i))){
                int a=hmap.get(s.charAt(i));
                hmap.remove(s.charAt(i));
                ++a;
                hmap.put(s.charAt(i), a);
            }
            else{
                hmap.put(s.charAt(i), 1);
            }
        }
        // System.out.println(hmap);
        List<Character> abc = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(Map.Entry<Character,Integer> a: hmap.entrySet()){
            // System.out.println(a.getKey()+"-"+a.getValue());
            if(a.getValue()%2!=0){
                abc.add(a.getKey());
            }
            map.put(a.getKey(), a.getValue()/2);
        }
        System.out.print("Matching with characters with count ");
        for(Map.Entry<Character,Integer> c: map.entrySet()){
            if(c.getValue()!=0){
            System.out.print(c.getKey()+"-"+c.getValue()+", ");
            }
        }
        System.out.println();
        System.out.print("Not Matching Character ");
        for (int i = 0; i <abc.size(); i++) {
            System.out.print(abc.get(i)+", ");
        }
    }
}
