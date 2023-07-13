package Others.PlacementTraining;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int check=0;
        int count=0;
        while(check<k){
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            int j=arr.length-1;
            for(int i=0;i<k;i++){
                if(arr[j]==0){

                    count--;
                    break;
                }
                arr[j]=arr[j]-1;
                if(arr[j]==0){
                    check++;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
