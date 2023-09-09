package Others;

import java.util.Scanner;

public class MaximumOccuranceOfK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int res = 0;
        int max=0;
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            int count=0;
            for (int j = arr[i]; j >0 ; j=j/10) {
                if (k==j%10){
                    count++;
                }
            }
            if (count>max){
                res = arr[i];
                max=count;
            }
        }
        System.out.println(res);
    }
}
