package Others.PlacementTraining;

import java.util.Scanner;

public class Problem84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        System.out.println(decrypt(s,n));
    }
    static String decrypt(String s,int n){
        String str="";
        for (int i = 0; i < s.length(); i=i+2) {
            str = str + s.charAt(i);
            int b = s.charAt(i + 1) - '0';
            for (int j = b; j > 1; j--) {
                str = str + s.charAt(i);
            }
        }
        if(n>str.length()){
            return "-1";
        }
        else{
            return ""+str.charAt(n-1);
        }
    }

}
