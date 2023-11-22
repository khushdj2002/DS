package Contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lexicographical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr=1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(curr);
            if (curr*10<=n){
                curr=curr*10;
            }
            else if(curr%10!=9&&curr<n){
                curr++;
            }
            else {
                while ((curr/10)%10==9){
                    curr=curr/10;
                }
                curr=curr/10;
                curr++;
            }
        }
        System.out.println(list);
    }
}
