package Stack;

import java.util.Stack;

public class ReversePolish {
    public static void main(String[] args) {
        String[] word={"4","13","5","/","+"};
        System.out.println(evalRPN(word));
    }
    static int evalRPN(String[] word){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals("*")||word[i].equals("-")||word[i].equals("+")||word[i].equals("/")){
                int c = stack.pop();
                int b = stack.pop();
                if(word[i].equals("*")){
                    b=b*c;
                } else if (word[i].equals("/")) {
                    b=b/c;
                } else if (word[i].equals("+")) {
                    b=b+c;
                } else if (word[i].equals("-")) {
                    b=b-c;
                }
                stack.push(b);
            }
            else{
                int a = Integer.parseInt(word[i]);
                stack.push(a);
            }
        }
        return stack.pop();
    }
}
