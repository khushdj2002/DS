package String;

import java.util.Arrays;

public class LexoSmall2 {
    public static void main(String[] args) {
        String s1 ="leetcode";
        String s2= "programs";
        String base = "sourcecode";
        System.out.println(smallestEquivalentString(s1,s2,base));
    }
    static public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] p = new int[26];
        for(int i=0;i<p.length;i++){
            p[i]=i;
        }
        for(int i=0;i<s1.length();i++){
            int a = s1.charAt(i)-'a';
            int b = s2.charAt(i)-'a';
            if(p[a]<p[b]){
                p[b]=p[a];
            }
            else{
                p[a]=p[b];
            }
            System.out.println(p[a]+"   "+p[b]);
        }
        System.out.println(Arrays.toString(p));
        String res ="";
        for(int i=0;i<baseStr.length();i++){
            int c = baseStr.charAt(i)-'a';
            char ch = (char)(p[c]+97);
            res=res+ch;
        }
        return res;
    }
}
