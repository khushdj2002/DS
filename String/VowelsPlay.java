package String;

import java.util.Scanner;

public class VowelsPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int minCost = 0;
        int min_a=0;
        int min_e=0;
        int min_i=0;
        int min_o=0;
        int min_u=0;
//        System.out.println('a'-'e');
//        System.out.println("hello");
        String des = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            if (des.contains(""+str.charAt(i))){
                min_a=min_a+(Math.abs('a'-str.charAt(i)));
                min_e=min_e+(Math.abs('e'-str.charAt(i)));
                min_i=min_i+(Math.abs('i'-str.charAt(i)));
                min_o=min_o+(Math.abs('o'-str.charAt(i)));
                min_u=min_u+(Math.abs('u'-str.charAt(i)));
            }
            else{
                minCost+=10;
            }
        }
        int min  =Math.min(min_a,Math.min(min_i,Math.min(min_e,Math.min(min_o,min_u))));
        System.out.println(min+minCost);
    }
}
