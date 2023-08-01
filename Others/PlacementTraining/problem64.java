package Others.PlacementTraining;

import java.util.Scanner;

public class problem64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%9==0){
            System.out.println(9);
        }
        else{
            System.out.println(n%9);
        }
    }
}
