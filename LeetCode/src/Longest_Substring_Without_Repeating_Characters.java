import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(lengthOfLongestSubstring(s));
    }
    static int lengthOfLongestSubstring(String s){
        int maxLength=0;
        int start=0;
        int[] position = new int[128];
        for (int i = 0; i < s.length(); i++) {
            start = Math.max(start,position[s.charAt(i)]);
//            System.out.println(start);
//            System.out.println(position[s.charAt(i)]);
            System.out.println((int)s.charAt(i));
            maxLength = Math.max(maxLength,i-start+1);
            position[s.charAt(i)]=i+1;
        }
        return maxLength;
    }
}
