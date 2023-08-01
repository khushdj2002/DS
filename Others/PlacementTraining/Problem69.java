package Others.PlacementTraining;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem69 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int count = 0;
        for (int i = low; i <=high ; i++) {
            int k = i%10;
            int j = i/10;
            if (j==0){
                count++;
            }
            else {
                for (int l = j; l >0 ; l=l/10) {
                    if(Math.abs(k-(l%10))!=1){
                        break;
                    }
                    k=l%10;
                    if (l/10==0){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        LinkedList<Integer> list = new LinkedList<>();
        
    }
}
