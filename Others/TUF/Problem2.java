package Others.TUF;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);
        printrev(n,0);
    }
    static void print(int a,int n){
        if (n==a){
            System.out.println(a);
            return;
        }
        System.out.println(a);
        print(++a,n);
    }
    static void printrev(int n,int a){
        if (n==a){
            return;
        }
        printrev(--n,a);
        System.out.println(n);

    }
}
