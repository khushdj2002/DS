package Others.PlacementTraining;

import java.io.*;
import java.util.*;

public class Problem10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum=0;
        int check=0;
        for(int i =s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':
                    if(check<=1){
                        sum=sum+1;
                    }
                    else{
                        sum=sum-1;
                    }
                    check=1;
                    break;
                case 'V':
                    if(check<=5){
                        sum=sum+5;
                    }
                    else{
                        sum=sum-5;
                    }
                    check=5;
                    break;
                case 'X':
                    if(check<=10){
                        sum=sum+10;
                    }
                    else{
                    sum=sum-10;
                    }
                check=10;
                break;
            case 'L':
                if(check<=50){
                    sum=sum+50;
                }
                else{
                    sum=sum-50;
                }
                check=50;
                break;
            case 'C':
                if(check<=100){
                    sum=sum+100;
                }
                else{
                    sum=sum-100;
                }
                check=100;
                break;
            case 'D':
                if(check<=500){
                    sum=sum+500;
                }
                else{
                    sum=sum-500;
                }
                check=500;
                break;
            case 'M':
                if(check<=1000){
                    sum=sum+1000;
                }
                else{
                    sum=sum-1000;
                }
                check=1000;
        }
    }
    System.out.println(sum);
}
}