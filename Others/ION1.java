package Others;

import java.util.Scanner;

public class ION1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum= s.length();
        for (int i = 1; i < s.length(); i++) {
            String pref = s.substring(0,i);
            String suff = s.substring(i,s.length());
            sum=sum+sumPref(pref,suff);
        }
        System.out.println(sum);
    }
    static int sumPref(String pref,String suff){
        int n = Math.min(pref.length(),suff.length());
        int count=0;
        for (int i = 0; i < n; i++) {
            if(pref.charAt(i)==suff.charAt(i)){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
