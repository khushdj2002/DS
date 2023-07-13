package Others.PlacementTraining;

import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)!=b.charAt(i)){
                count++;
            }
        }
        System.out.println((double)count*100/a.length());
    }
}
