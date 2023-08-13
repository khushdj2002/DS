package Others.PlacementTraining;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem86 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();

            int steps = minStepsToReach(N, M);
            System.out.println(steps);
        }

        public static int minStepsToReach(int N, int M) {
            if (N == 1 && M == 1) {
                return 0;
            }

            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{1, 1, 0});

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                int steps = current[2];

                if (x == N && y == M) {
                    return steps;
                }

                int newX = x + y;
                int newY = y;
                if (newX <= N && newY <= M) {
                    queue.offer(new int[]{newX, newY, steps + 1});
                }

                newX = x;
                newY = x + y;
                if (newX <= N && newY <= M) {
                    queue.offer(new int[]{newX, newY, steps + 1});
                }
            }

            return -1;
        }
}
