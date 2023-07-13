package Others.PlacementTraining;

import java.util.Scanner;

public class Problem25 {
        static int printSubsets(int set[][],int cap)
        {
            int max=0;
            int n = set.length;
            for (int i = 0; i < (1<<n); i++)
            {
                int count=0;
                int cap_h=0;
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) > 0) {
                        count=count+set[j][1];
                        cap_h=cap_h+set[j][0];
                        if (cap_h<=cap){
                            if(max<count){
                                max=count;
                            }
                        }
                        else{
                            break;
                        }
//                        System.out.print(set[j][1] + " ");
                    }
                }
//                System.out.println();
            }
            return max;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int n = sc.nextInt();
                int cap = sc.nextInt();
                int arr[][] = new int[n][2];
                for (int j = 0; j < n; j++) {
                    arr[j][0] = sc.nextInt();
                    arr[j][1] = sc.nextInt();
                }
                System.out.println(printSubsets(arr,cap));
            }


        }

}
