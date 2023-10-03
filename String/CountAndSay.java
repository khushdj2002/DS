package String;

import java.util.Scanner;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countSay(n));
    }
    static String countSay(int n){
        if (n==1){
            return "1";
        }
        return say(countSay(n-1));
    }
    static String say(String s){
        String d = "";
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1)!=s.charAt(i)){
                d=d+count;
                d=d+s.charAt(i-1);
                count=1;
            }
            else{
                count++;
            }
        }
        d=d+count;
        d=d+s.charAt(s.length()-1);
        return d;
    }
}
