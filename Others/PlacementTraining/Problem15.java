package Others.PlacementTraining;

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        n=Math.abs(n);
        if (n==0){
            System.out.println("No factors");
        }
        else if(n==1){
            System.out.println("Factors of "+n+" is "+n);
        }
        else{
            System.out.print("Factors of "+n+" are 1 ");
            for (int i = 2; i <= n / 2; i++) {
                if(n%i==0){
                    System.out.print(i+" ");
                }
            }
            System.out.println(n);
        }
        String z  = "TFFTFTTFTFFFFTFFTTFTFFTTFFTTFFFTFTTTFFTTFFTFFFFTFFTTTFFTFFTFFTTTFTFFFFTTTFFTTTTTTFFTTFTFTFTFFTFFTFFT";
        int e=0;
        int f=0;
        for (int i = 0; i < z.length(); i++) {
            if (z.charAt(i)=='T'){
                e++;
            }
            else {
                f++;
            }
        }
        System.out.println(z.length()+" "+e+" "+f);

    }
}
