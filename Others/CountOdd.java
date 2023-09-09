package Others;

import java.util.Scanner;

public class CountOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<100){
            System.out.println(9);
        } else if (n < 10000) {
            System.out.println(9+n-99);
        } else if (n<1000000) {
            System.out.println(9+900+n-9999);
        }
    }
}
