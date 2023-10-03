package String;

import java.util.Scanner;

public class ValidIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (check(s)){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
    static boolean check(String s){
        String[] word = s.split("\\.");
        if (word.length!=4){
            return false;
        }
        for (int i = 0; i < word.length; i++) {
            int a = Integer.parseInt(word[i]);
            if(a<0||a>255){
                return false;
            }
        }
        return true;

    }
}
