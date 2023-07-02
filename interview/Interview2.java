package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interview2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        List<Integer> n = new ArrayList<>();
        int count=1;
        char ch = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(ch==s.charAt(i)){
                count++;
            }
            else{
                n.add(count);
                ch=s.charAt(i);
                count=1;
            }
        }
        n.add(count);
        System.out.println(n);

    }
}
