package CP;

import java.util.HashMap;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        s=s.toLowerCase();
        String check="";
        String res="";
        for (int i = 0; i < s.length(); i++) {
            if(check.contains(s.charAt(i)+"")){
                char ch = s.charAt(i);
                ++ch;
                res=res+ch;
            }
            else{
                check=check+s.charAt(i);
                res=res+s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
