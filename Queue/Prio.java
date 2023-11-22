package Queue;

import java.util.PriorityQueue;

public class Prio {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < 5; i++) {
            pq.add(i);
            pq.add(i+2);
        }
        System.out.println(pq);
    }
}

