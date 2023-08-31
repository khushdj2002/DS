package Others;

import java.util.Scanner;

public class XOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max=1;
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            int xor = arr[i];
            for (int j = i+1; j < n; j++) {
                sum=sum+arr[j];
                xor=xor^arr[j];
                if(sum==xor){
                    if(j-i+1>max){
                        max=j-i+1;
                    }
                }

            }
        }
        System.out.println(max);
    }
}
