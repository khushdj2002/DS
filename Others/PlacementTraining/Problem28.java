package Others.PlacementTraining;

import java.util.Arrays;
import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n-1];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int student = sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr[i+1]-arr[i];
        }
        int count=0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr1.length - student + 1; i++) {
            count=arr1[i];
            for (int j = 1; j <student-1 ; j++) {
                count=count+arr1[i+j];
            }
            if (min>count){
                min=count;
            }
        }
        System.out.println(min);
    }
}
