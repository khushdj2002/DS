package Others.PlacementTraining;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        if (s.length()!=10){
            System.out.println("Illegal ");
        }
        else{
            int sum=1;
            int pos=10;
            for (int i = n; i >0 ; i=i/10) {
                sum=sum+(pos*i%10);
                pos--;
            }
            if (sum%11==0){
                System.out.println("Legal");
            }
            else{
                System.out.println("Illegal");
            }
        }
    }
}
