package Others.TUF.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class K_thPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int fact=1;
        List<Integer> list = new ArrayList<>();
        List<Integer> elements = new ArrayList<>();
        int i=1;
        while (i<=n){
            elements.add(i);
            i++;
        }
        list.add(1);
        for (int j = 1; j < n; j++) {
            fact=fact*j;
            list.add(fact);
        }
        k=k-1;
        System.out.println(list);
        System.out.println(elements);
        StringBuilder res= new StringBuilder();
        while (true){
            int x = elements.get((k/list.get(list.size()-1)));
            res.append(x);


            k=k% list.get(list.size()-1);
            elements.remove((Integer) x);
            list.remove(list.size()-1);
            if (elements.size()==0){
                break;
            }
        }

        System.out.println(res.toString());
    }
}
