package Others.TUF;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        print(n,s);
    }
    static void print(int n,String s){
        if (n==0){
            return;
        }
        System.out.println(s);
        print(--n,s);
    }
}
