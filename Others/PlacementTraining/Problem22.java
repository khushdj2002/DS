package Others.PlacementTraining;

import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(numberOfCarries(sc.nextInt(),sc.nextInt(),0,0));
    }
    static int numberOfCarries(int num1,int num2,int n,int product){

        if((num1>0&&product!=0)||(num2>0&&product!=0)||(num1>0&&num2>0)){
            product += num1%10+num2%10;
            product=product/10;
            if (product>0){
                n++;
            }
            return numberOfCarries(num1/10,num2/10,n,product);
        }
        else{
            return n;
        }

    }
}
