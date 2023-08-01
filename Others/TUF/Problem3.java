package Others.TUF;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n,0));
        System.out.println(func(n));
    }
    static int printSum(int n,int sum){
        if (n==0){
            return sum;
        }
        return printSum(n-1,sum+n);
    }
    static int func(int n){
        if (n==0){
            return 0;
        }
        return n+func(n-1);
    }
}
