package Others;

import java.util.Scanner;

public class SpecialArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int count = 0;

        if(arr[0]%2==1){
            count=1;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==count){
                if (count==0){
                    count=1;
                }
                else {
                    count=0;
                }
            }
            else{
                System.out.println("NO");
                break;
            }
            if (i==n-1){
                System.out.println("YES");
            }
        }
    }
}
