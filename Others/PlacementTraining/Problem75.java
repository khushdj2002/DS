package Others.PlacementTraining;

import java.util.ArrayList;
import java.util.List;

public class Problem75 {
    public static void main(String[] args) {

        String[] arr = {"This", "is", "an", "example", "of", "text", "justification."};
        int max = 16;
        System.out.println(fullJustify(arr,max));
    }
    static public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();
        int count=words[0].length();
        String str=words[0];
        for(int i=1;i<words.length;i++){
            if(count<maxWidth&&count!=0){
                str=str+" ";
                count++;
            }
            if(count+words[i].length()<maxWidth){
                str=str+words[i];
                count+=words[i].length();
            }
            else{
                list.add(str);
                str="";
                count=0;
                i--;
            }
        }
        list.add(str);
        return list;
    }
}
