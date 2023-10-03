package String;

import java.util.ArrayList;
import java.util.List;

public class CombinationOfAllWords {
    public static void main(String[] args) {
        String[] word = {"word","good","best","word1"};
        List<String> list = new ArrayList<>();
        combine(word,list,new ArrayList<>());
        System.out.println(list);
        System.out.println(list.size());
    }
    static void combine(String[] word,List<String> list,List<String> li){
        if (li.size()== word.length){
            String s = "";
            for (int i = 0; i < li.size(); i++) {
                s=s+li.get(i);
            }
            list.add(s);
            return;
        }
        for (int i = 0; i < word.length; i++) {
            if (li.contains(word[i])){
                continue;
            }
            li.add(word[i]);
            combine(word, list, li);
            li.remove(li.size()-1);
        }
    }
}
