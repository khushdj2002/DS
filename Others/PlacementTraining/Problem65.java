package Others.PlacementTraining;

import java.util.Scanner;

public class Problem65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(power(n,2));
    }
    static boolean power(int n,int a){
        if(n==0){
            return false;
        }
        if (n==1){
            return true;
        }
        if(a>n){
            return false;
        }
        if(n==a){
            return true;
        }
        return power(n,a*2);
    }
}
