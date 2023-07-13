package Others.PlacementTraining;

import java.util.Scanner;
import java.util.TreeSet;

public class Problem39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> tr = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            tr.add(sc.nextInt());
        }
        System.out.println(tr.last());
    }
}
