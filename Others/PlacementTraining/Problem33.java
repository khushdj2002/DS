package Others.PlacementTraining;

import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  =sc.nextInt();
        String s = Integer.toBinaryString(n);
//        System.out.println(s);
        String res = "";
        for (int i = 1; i < s.length(); i++) {
                if(s.charAt(i-1)==s.charAt(i)){
                    res=res+"0";
                }
                else {
                    res=res+"1";
                }
        }
        if (s.charAt(s.length()-1)=='1'){
            res=res+"0";
        }
        else{
            res=res+"1";
        }
        int sum=0;
        int j=res.length()-1;
        int k=1;
        while (j>=0){
                if (res.charAt(j)=='1'){
                    sum=sum+k;
                }
                k=k*2;
            j--;
        }
//        System.out.println(res);
        System.out.println(sum);
    }
}
