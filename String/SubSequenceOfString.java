package String;
import java.util.*;
class SubSequenceOfString {
    static List<String> al = new ArrayList<>();
    public static void main(String[] args)
    {
        String s = "AAABBC";
        findsubsequences(s, "");
        System.out.println(al);
        System.out.println(al.size());
    }

    private static void findsubsequences(String s,String ans){
        if (s.length() == 0) {
            al.add(ans);
            return;
        }
        findsubsequences(s.substring(1), ans + s.charAt(0));
        findsubsequences(s.substring(1), ans);
    }
}
