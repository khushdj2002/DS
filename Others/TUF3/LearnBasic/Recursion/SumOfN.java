package Others.TUF3.LearnBasic.Recursion;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if (n==1||n==0){
            return 1;
        }
        return n*sum(n-1);
    }
}
