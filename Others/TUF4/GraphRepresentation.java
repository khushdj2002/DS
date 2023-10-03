package Others.TUF4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
//            list.add(new ArrayList<>());
            list.get(u).add(v);
            list.get(v).add(u);
        }
        System.out.println(list);
    }
}
