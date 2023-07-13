package Others.PlacementTraining;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=b) {
            for (int i = a; i <= b; i++) {
                if (isPrime(i)){
                    System.out.print(i+" ");
                }
            }
        }
        else {
            System.out.println("Provide Valid Input");
        }
    }
    static boolean isPrime(int n){
        for (int i = n/2; i >1; i--) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
