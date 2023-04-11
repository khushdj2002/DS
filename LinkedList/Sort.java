package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        List<String> ls = new ArrayList<>();
        char[] ch = s.toCharArray();
        System.out.println(ch);
        StringBuilder a = new StringBuilder();
        for (char c : ch) {
            if (c == ' ') {
                a=a.reverse();
                ls.add(a.toString());
                a = new StringBuilder();
            } else {
                a.append(c);
            }
        }
        ls.add(a.reverse().toString());
        System.out.println(ls);
        Collections.sort(ls);
        System.out.println(ls);
        String res="";
        for (int i = 0; i < ls.size(); i++) {
            StringBuilder sb = new StringBuilder(ls.get(i));
            sb.deleteCharAt(0);
            sb=sb.reverse();
            res=res+sb.toString()+" ";
        }
        System.out.println(res);
        
    }
}
