package Others.PlacementTraining;

import java.util.Scanner;

public class Problem73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2= new StringBuilder(t);

        while (sb1.length()!=0){
            if(sb2.toString().contains(sb1.charAt(0)+"")){
                sb2.deleteCharAt(sb2.indexOf(String.valueOf(sb1.charAt(0))));
                sb1.deleteCharAt(0);
            }
            else {
                System.out.println("break");
                break;
            }
        }
    }
}
