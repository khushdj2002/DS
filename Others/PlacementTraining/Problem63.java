package Others.PlacementTraining;

import java.util.Scanner;

public class Problem63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digit(n));
    }
    static int digit(int n){
        if(n/10==0){
            return n;
        }
        int sum=0;
        for (int i = n; i >0 ; i=i/10) {
            sum=sum+i%10;
        }
        return digit(sum);
    }
}
