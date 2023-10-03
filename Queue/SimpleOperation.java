package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class SimpleOperation {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(5);
        queue.poll();
    }
}
