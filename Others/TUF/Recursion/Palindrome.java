package Others.TUF.Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.next();
        if(checkPalindrome(s,0)){
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("It's not a palindrome");
        }

    }
    static boolean checkPalindrome(String s,int i){
        if (i>s.length()/2){
            return true;
        }
        if (s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return checkPalindrome(s,i+1);
    }
}
