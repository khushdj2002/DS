package Others.TUF;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePartitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<List<String>> list = new ArrayList<>();

        palind(s,list,new ArrayList<>(),0);
        System.out.println(list);
    }
    static void palind(String s,List<List<String>> list,List<String> li,int index){
        if (index==s.length()){
            list.add(new ArrayList<>(li));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isValid(s.substring(index,i+1))){
                li.add(s.substring(index,i+1));
                palind(s,list,li,i+1);
                li.remove(li.size()-1);
            }
        }
    }
    static boolean isValid(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if (sb.toString().equals(s)){
            return true;
        }
        return false;
    }
}
