package Others.PlacementTraining;

import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String g = sc.next();
        String s = "";
        for (int i = 0; i < g.length(); i++) {
            if(g.charAt(i)>='A'&&g.charAt(i)<='Z'||g.charAt(i)>='a'&&g.charAt(i)<='z'){
                s=s+g.charAt(i);
            }
        }
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equals(s)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
