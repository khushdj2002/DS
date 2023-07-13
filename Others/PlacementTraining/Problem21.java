package Others.PlacementTraining;

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(operationChoices(sc.nextInt(), sc.nextInt(),sc.nextInt()));
    }
    static int operationChoices(int c,int a,int b){
        switch (c){
            case 1:
                return a+b;
            case 2:
                return a-b;
            case 3:
                return a*b;
            case 4:
                return a/b;
        }
        return 0;
    }
}
