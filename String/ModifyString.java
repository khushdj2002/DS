package String;

import java.util.Scanner;

public class ModifyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        String str ="";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                System.out.println(res.toLowerCase()+str.toUpperCase());
                res=""+s.charAt(i);
                str="";
            }
            else{
                str+=s.charAt(i);
            }
        }
        System.out.println(res.toLowerCase()+str.toUpperCase());
    }
}
