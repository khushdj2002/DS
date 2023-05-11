package CP;

import java.lang.reflect.Array;
import java.util.*;

import javax.lang.model.type.ArrayType;

public class Anagram {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String r = sc.next();
    LinkedList<Character> ls = new LinkedList<>();
    LinkedList<Character> lr = new LinkedList<>();
    for (int i = 0; i < s.length(); i++) {
        ls.add(s.charAt(i));
        lr.add(r.charAt(i));
    }
    Collections.sort(ls);
    Collections.sort(lr);
    if(ls.equals(lr)){
        System.out.println("It's an anagram");
    }
    else{
        System.out.println("It's not an anagram");
    }
    }
}
