package Others.PlacementTraining;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(n!=0){
            n=n-i;
            if(n<=0){
                System.out.println("Oswald");
                break;
            }
            n-=(2*i);
            if (n<=0){
                System.out.println("Henry");
                break;
            }
            i++;
        }
    }
}
