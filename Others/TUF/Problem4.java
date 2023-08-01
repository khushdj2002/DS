package Others.TUF;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int insert = min(arr);
        System.out.println(insert);
    }
    static int min(int[] arr){
        int a = -1;
        int max = arr[1]-arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i]>max){
                a=i;
                max=arr[i+1]-arr[i];
            }
        }
        int sum=0;
        int [] res = new int[arr.length+1];
        int j=0;
        for (int i = 0; i < res.length; i++) {
            if(i==a+1){
                res[i]= (arr[i-1]+arr[i])/2;
                res[i+1] = arr[i];
            }
            else{
                res[i]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
        return a;
    }
}
