package Others.PlacementTraining;

import java.util.Scanner;

public class Problem68 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int j=0;
        int check=0;
        for(int i=0;i<b.length();i++){
            if(j>a.length()-1){
                System.out.println("FALSE");
                break;
            }
            if(a.charAt(j)=='*'){
                if(a.length()-1==j){
                    System.out.println("TRUE");
                    break;
                }
                check=1;
            }
            if(check==0){
                if(b.charAt(i)!=a.charAt(j)){
                    if(a.charAt(j)!='?'){
                        System.out.println("FALSE");
                    }
                    else{
                        j++;
                    }
                }
                else{
                    j++;
                }
            }
            else{
                int k=j+1;
                while(a.charAt(k)=='?'){
                    k++;
                }
                if(b.charAt(i)==a.charAt(k)){
                    check=0;
                    j=k+1;
                }
            }
            if(i==b.length()-1&&j==a.length()){
                System.out.println("TRUE");
            } else if (i==b.length()-1) {
                System.out.println("FALSE");
            }
        }
    }
}
