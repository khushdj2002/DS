package Others.PlacementTraining;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int days = sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            int C=sc.nextInt();
            int count=0;
            for (int j = 1; j <= days; j++) {
                if(j%A==0||j%B==0||j%C==0){
                    if(j%A==0&&j%B==0||j%B==0&&j%C==0||j%C==0&&j%A==0){

                    }
                    else{
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
