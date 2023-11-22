package Stack;

import java.util.Stack;

public class Sample1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 8; i++) {
            st.add(i);
        }
        st.push(10);

        System.out.println(st);
        System.out.println(st.peek());
        


    }
}
