package Others.TUF3.LearnBasic.Pattern;

import java.util.Scanner;

public class Patter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 5;
        int n = 5;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
