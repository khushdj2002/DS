package String;

import java.util.ArrayList;
import java.util.List;

public class LongestSubsequence {
    public static void main(String[] args) {
        String a ="abc";
        String b = "acf";
        char[] ch = a.toCharArray();



        System.out.println(longList(b,new ArrayList<>(),ch,0));

    }
    static int longList(String b,List<Character> li,char[] ch,int index){
        if (index==ch.length){
            StringBuilder sb = new StringBuilder();
            for (Character sh:li) {
                sb.append(sh);
            }
            if(same(b,sb.toString())){
                return sb.length();
            }
            return 0;
        }
        li.add(ch[index]);
        int take=longList(b, li, ch, index+1);
        li.remove(li.size()-1);
        int not_take=longList(b, li, ch, index+1);
        return Math.max(take,not_take);
    }
    static boolean same(String a,String b){
        if (a.contains(b)){
            return true;
        }
        return false;
    }
}
