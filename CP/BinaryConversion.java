package CP;

import java.util.Scanner;
import java.util.Stack;

class BinaryConversion {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<16){
        for (int i = n; i >0; i=i/2) {
            s.push(i%2);
        }
        while(s.size()!=4){
            s.push(0);
        }
       while(!s.isEmpty()){
        System.out.print(s.pop());
       }
    }
    else{
        System.out.println("Overflow");
    }
    }
}