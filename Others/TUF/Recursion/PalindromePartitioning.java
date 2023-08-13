package Others.TUF.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromePartitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(partition(s));
    }
    static public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        subSet(list,new ArrayList<>(),s,0);
        return list;
    }
        static void subSet(List<List<String>> list,List<String> li,String s,int index){
            if(index==s.length()){
                list.add(new ArrayList<>(li));
                return;
            }
            for(int i=index;i<s.length();i++){
                if(isValidate(s.substring(index,i+1))){
                    li.add(s.substring(index,i+1));
                    subSet(list,li,s,i+1);
                    li.remove(li.size()-1);
                }
            }
        }
    static boolean isValidate(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            return true;
        }
        return false;
    }
}
