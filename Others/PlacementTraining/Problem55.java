package Others.PlacementTraining;

import java.util.Scanner;

public class Problem55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = "";
        String b = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='#'){
                a+=s.charAt(i);
            }
            else {
                b+=s.charAt(i);
            }
        }
        System.out.println(a+b);
    }
}
