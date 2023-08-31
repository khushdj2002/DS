package String;

import java.util.*;

public class SubDomainVisitCount {
    public static void main(String[] args) {
        String[] ar = {"9001 discuss.leetcode.com"};
        System.out.println(subdomainVisits(ar));
    }
    static public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> hmap = new HashMap<>();
        List<String> s = new ArrayList<>();
        for(String a : cpdomains){
            String[] str = a.split(" ");
//            String[] str1 = str[1].split("\\.",2);
//            String[] str2 = str1[1].split("\\.",2);
//            System.out.println(Arrays.toString(str));
//            System.out.println(Arrays.toString(str1));
//            System.out.println(Arrays.toString(str2));
            int b = Integer.parseInt(str[0]);
            while(str[1].contains(".")){
                hmap.put(str[1],hmap.getOrDefault(str[1],0)+b );
                String[] str2 = str[1].split("\\.",2);
                str[1]=str2[1];
            }
            hmap.put(str[1],hmap.getOrDefault(str[1],0)+b );
        }
        System.out.println(hmap);
        for (Map.Entry<String,Integer> e : hmap.entrySet()){
            String sa = new String(e.getValue()+"="+e.getKey());
            s.add(sa);
        }
    return  s;
    }
}
