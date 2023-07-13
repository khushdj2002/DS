package Others.PlacementTraining;

import java.util.Scanner;
import java.util.Stack;

public class Problem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res="";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        while (st.size()!=0){
            res+=st.pop();
        }
        System.out.println(res);
    }
}
