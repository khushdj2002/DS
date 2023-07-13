package Others.PlacementTraining;

import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        StringBuilder sb = new StringBuilder(B);
        int count=0;
        int j=0;
        int min = Integer.MAX_VALUE;
        String res = "";
        for (int i = 0; i < A.length(); i++) {
            if (sb.toString().contains(A.charAt(i)+"")&&count==0){
                count++;
                sb.deleteCharAt(sb.toString().indexOf(A.charAt(i)));
                j=i;
            }
            else if (sb.toString().contains(A.charAt(i)+"")){
                sb.deleteCharAt(sb.toString().indexOf(A.charAt(i)));
                if (sb.length()==0){
                    if(min>(i-j)){
                        res=A.substring(j,i+1);
                        min=res.length();
                    }
                    count=0;
                    i=j;
                    sb=new StringBuilder(B);
                }
            }
        }
        System.out.println(res);
    }
}
