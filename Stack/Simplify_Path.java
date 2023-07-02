package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Simplify_Path {
    public static void main(String[] args) {
        String path = "/home/";

        Stack<Character> st = new Stack<>();
        System.out.println(st.peek());
        for (int i = 0; i < path.length(); i++) {
            st.push(path.charAt(i));
        }
        System.out.println(st);
        System.out.println();

    }
}
