package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Sample1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.poll();
        q.offer(8);
        System.out.println(q);
    }
}
