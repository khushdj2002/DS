package Others.PlacementTraining;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int remove = sc.nextInt();
        list.remove(n-remove);
        System.out.println(list);
    }
}
