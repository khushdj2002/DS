package Contest;

import java.util.Scanner;

public class FirstUniqueCharacter_in_aString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb = new StringBuilder(s);
            char ch = s.charAt(i);
            sb = sb.deleteCharAt(i);
            if(!sb.toString().contains(""+ch)){
                System.out.println(i);
                break;
            }
        }
        System.out.println("done");
    }
}
