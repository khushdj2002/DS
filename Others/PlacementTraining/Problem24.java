package Others.PlacementTraining;

import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int cap = sc.nextInt();
            int arr[][] = new int[n][2];
            for (int j = 0; j < n; j++) {
                arr[j][0]=sc.nextInt();
                arr[j][1]=sc.nextInt();
            }
            int max=0;
            int count=0;
            int cap_h=0;
            for (int j = 0; j < n; j++) {
                    cap_h=arr[j][0];
                    count=arr[j][1];
                    if(cap_h<=cap){
                        if(max<count){
                            max=count;
                        }
                    }
                for (int k = j+1; k < n; k++) {
                    cap_h=cap_h+arr[k][0];
                    count=count+arr[k][1];
                    if (cap_h<=cap){
                        if (max<count){
                            max=count;
                        }
                    }
                    else {
                        break;
                    }
                }
            }
            System.out.println(max);
        }
    }
    static int printSubsets(int set[][])
    {
        int n = set.length;
        for (int i = 0; i < (1<<n); i++)
        {
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {

                    System.out.print(set[j][0] + " ");
                }
            }
            System.out.println();
        }
        return 0;
    }
}
