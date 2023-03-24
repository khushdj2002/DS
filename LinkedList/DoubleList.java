package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class DoubleList {
    public static void main(String[] args) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> fir = new ArrayList<>();

        fir.add(1);
        fir.add(2);
        fir.add(3);

        ll.add(fir);

        fir.remove(0);
        ll.add(fir);
        int a = Integer.MAX_VALUE;
        System.out.println(a);

        System.out.println(ll);
    }
}
