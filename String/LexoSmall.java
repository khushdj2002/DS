package String;

import java.util.ArrayList;
import java.util.List;

public class LexoSmall {
    public static void main(String[] args) {
            String s1 ="leetcode";
            String s2= "programs";
            String base = "sourcecode";
        System.out.println(smallestEquivalentString(s1,s2,base));
        }

        static private int[] p;

        static  String smallestEquivalentString(String s1, String s2, String baseStr) {
            p = new int[26];
            for (int i = 0; i < 26; ++i) {
                p[i] = i;
            }
            for (int i = 0; i < s1.length(); ++i) {
                int a = s1.charAt(i) - 'a', b = s2.charAt(i) - 'a';
                int pa = find(a), pb = find(b);
                if (pa < pb) {
                    p[pb] = pa;
                } else {
                    p[pa] = pb;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char a : baseStr.toCharArray()) {
                char b = (char) (find(a - 'a') + 'a');
                sb.append(b);
            }
            return sb.toString();
        }

        static private int find(int x) {
            if (p[x] != x) {
                p[x] = find(p[x]);
            }
            return p[x];
        }
}
