package Others.PlacementTraining;

import java.util.Arrays;
import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int is =0;
        int mark = -1;
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                int min = Integer.MAX_VALUE;
                mark = -1;
                for (int j = i; j < n; j++) {
                    if (arr[i - 1] < arr[j] && arr[j] < min) {
                        min = arr[j];
                        mark = j;
                    }
                }
                int temp = min;
                arr[mark] = arr[i - 1];
                arr[i - 1] = temp;
                int cop[] = new int[n - i];
                System.arraycopy(arr, i, cop, 0, n - i);
                Arrays.sort(cop);
                for (int j = 0; j < cop.length; j++) {
                    arr[i + j] = cop[j];
                }
                break;
            }
        }
        if (mark == -1) {
            int arr_dup[] = new int[n];
            int neg=0;
            int j;
            if (arr[n-1]==0){
                 j=1;
            }
            else {
                 j=0;
            }

            for (int i = n-1; i >= 0; i--) {
                if (arr[i]==0){
                    neg=1;
                    arr_dup[j]=arr[i];
                    j++;
                }
                else{
                    if (neg==1){
                        arr_dup[0]=arr[i];
                        neg=0;
                    }
                    else{
                        arr_dup[j]=arr[i];
                        j++;
                    }

                }
            }
            System.out.println(Arrays.toString(arr_dup));
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }

}
