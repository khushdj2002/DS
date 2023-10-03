package String;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> list = new ArrayList<>();
        combine(list,s,new ArrayList<>(),0);
        System.out.println(list);
    }
    static void combine(List<List<String>> list,String s,List<String> ls,int index){
        if (index==s.length()){
            list.add(new ArrayList<>(ls));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            String p = s.substring(index,i+1);
            System.out.println(p);
            if (isValidate(p)){
                ls.add(p);
                combine(list, s, ls, i+1);
                ls.remove(ls.size()-1);
            }
        }
    }
    static boolean isValidate(String s){
        StringBuilder sb = new StringBuilder(s);
        if (s.equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }
}
