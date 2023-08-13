package Others.PlacementTraining;

import java.util.Scanner;

public class Problem83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if (sb.toString().equals(s)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
