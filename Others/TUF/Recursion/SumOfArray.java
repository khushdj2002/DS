package Others.TUF.Recursion;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n,0));
    }
    static int sum(int n,int sum){
        if (n<1){
            return sum;
        }
        return sum(n-1,sum+n);
    }
}
