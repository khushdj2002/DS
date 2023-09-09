package Others;

import java.util.Scanner;

public class LongestSubstringEvenLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        if (s.length()%2==1){
            s=s.substring(0,n-1);
        }
        for (int i = s.length(); i >0 ; i=i-2) {
            System.out.println(s.substring(0,i));
            int a = Integer.parseInt(s.substring(0,i/2));
            int b = Integer.parseInt(s.substring(i/2,i));
            int sum_j=0;
            int sum_k=0;
            for (int j = a; j >0 ; j=j/10) {
                sum_j=sum_j+j%10;
            }
            for (int j = b; j >0 ; j=j/10) {
                sum_k=sum_k+j%10;
            }
            System.out.println(sum_j+"  "+sum_k);
            if (sum_j==sum_k){
                System.out.println(i*2);
                break;
            }
            if (i==2){
                System.out.println(0);
                break;
            }
        }
        System.out.println(s);
    }
}
