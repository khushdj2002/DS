package Others.PlacementTraining;

import java.util.Arrays;
import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n  =sc.nextInt();
        System.out.println("Enter the elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.print("Contains duplicate: ");
        if(duplicate(arr)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    static boolean duplicate(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
