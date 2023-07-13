package Others.PlacementTraining;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =0;
        int count=0;
        while(n>=0){

            count = count+(int)Math.pow(2,(n+m-1));
            n=n-2;
            m++;
        }
        System.out.println(count);
    }
}
