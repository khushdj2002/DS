package Others.PlacementTraining;

import java.util.Scanner;

public class Problem74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pur = sc.nextInt();
        int ch = pur/10;


            if(pur%10>=5){
                ch=ch+1;
            }

        ch=ch*10;
        System.out.println(100-ch);
    }
}
