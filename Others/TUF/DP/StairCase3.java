package Others.TUF.DP;

import java.util.Scanner;

public class StairCase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }
    static int check(int n){
        if (n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if (n==3){
            return 4;
        }
        return check(n-1)+check(n-2)+check(n-3);
    }
}
