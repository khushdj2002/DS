package CP;

import java.util.Arrays;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        String m="";
        String n="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)<='Z'){
                m+=s.charAt(i);
            }
            else{
                n+=s.charAt(i);
            }
        }
        char chm[]  = m.toCharArray();
        char chn[] = n.toCharArray();
        Arrays.sort(chm);
        Arrays.sort(chn);
        String zm = String.valueOf(chm);
        String zn = String.valueOf(chn);
        StringBuilder sb = new StringBuilder(zm);
        sb=sb.reverse();
        System.out.println(sb.toString()+zn);
    }
}
