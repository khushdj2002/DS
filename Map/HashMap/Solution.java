package Map.HashMap;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int n= 700;
        String res="";
        Solution sol= new Solution();
        sol.check(50);
    }
    int check(int a){
        if(a==0){
            return 0;
        }
        else{
            if(a>=1000){
                check(a-1000);
                System.out.println('M');
            }
            else if(a>=500){
                check(a-500);
                System.out.println('D');
            }
            else if(a>=100){
                check(a-100);
                System.out.println('C');
            }
            else if(a>=50){
                check(a-50);
                System.out.println('L');
            }
            else if(a>=10){
                check(a-10);
                System.out.println('X');
            }
            else if(a>=5){
                check(a-5);
                System.out.println('V');
            }
            else{
                check(a-1);
                System.out.println('I');
            }
        }
        return 0;
    }
}
