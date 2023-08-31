package Others;

import java.util.Scanner;

public class Notes {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }
    static int check(int n){
        if (n==0){
            return count;
        }
        if (n>=100){
            count=count+n/100;
            return check(n%100);
        } else if (n>=50) {
            count=count+n/50;
            return check(n%50);
        } else if (n >= 20) {
            count=count+n/20;
            return check(n%20);
        } else if (n >= 10) {
            count=count+n/10;
            return check(n%10);
        } else if (n >= 5) {
            count=count+n/5;
            return check(n%5);
        } else if (n >= 2) {
            count=count+n/2;
            return check(n%2);
        } else {
            count=count+n;
            return check(0);
        }

    }
}
