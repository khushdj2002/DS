package STS.LinkedList;

import java.util.Stack;

class MinStack1 {
    Stack<Integer> s = new Stack<>();
    int min;

    void push(int data){
        if (s.isEmpty()){
            s.push(data);
            min=data;
        } else if (data > min) {
            s.push(data);
        }else {
            s.push(2*data - min);
            min=data;
        }
    }
    int getMin(){
        return min;
    }
    public void pop()
    {
        if (s.empty()) {
            System.out.println("Stack underflow!!");
            System.exit(-1);
        }

        int top = s.peek();
        if (top < min) {
            min = 2*min - top;
        }
        s.pop();
    }
}
class MinStack{
    public static void main(String[] args) {
        MinStack1 ms = new MinStack1();
        ms.push(6);
        System.out.println(ms.getMin());
        ms.push(5);
        System.out.println(ms.getMin());
        ms.push(7);
        System.out.println(ms.getMin());
        ms.push(3);
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.pop();
        System.out.println(ms.getMin());
        ms.push(2);
        System.out.println(ms.getMin());
    }
}
