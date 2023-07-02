import java.util.Scanner;

public class Fibonacci {
    static int sum=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int sum=0;
        System.out.println(fibb(n,0,1,2));
    }
    static int fibb(int n,int a,int b,int check){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        sum=a+b;
        b=a;
        if(n==check){
            return sum;
        }

        return fibb(n,sum,b,++check);
    }
}
