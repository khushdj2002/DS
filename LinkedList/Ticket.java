package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ll.add(i);
        }

        System.out.println(ll);
        for (int i = 0; i < 3; i++) {
            int a = ll.get(i);
            --a;
            ll.remove(i);
            ll.add(i,a);
        }
        System.out.println(ll);
    }
}
