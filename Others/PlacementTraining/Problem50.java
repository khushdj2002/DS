package Others.PlacementTraining;

import java.util.Scanner;

public class Problem50 {
    public static void main(String[] args) {
        int odd = 1;
        int even=2;
        Scanner sc = new Scanner(System.in);
        int check= sc.nextInt();
        check--;
        if (check==0){
            System.out.println(check+1);
        }
        else if (check%2==0){
            while (check!=2){
                even=even*2;
                check=check-2;
            }
            System.out.println(even);
        }
        else{
            while (check!=1){
                odd=odd*3;
                check=check-2;
            }
            System.out.println(odd);
        }
    }
}
