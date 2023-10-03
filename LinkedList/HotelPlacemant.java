package LinkedList;

import java.util.*;

public class HotelPlacemant {
    public static void main(String[] args) {
        int n = 5;
        int[][] roads = {{1, 2}, {1, 3}, {1, 4}, {1, 5}};

        int ways = numberOfWays(n, roads);
        System.out.println("Number of Ways: " + ways);
    }

    public static int numberOfWays(int n, int[][] roads) {
        // Create an adjacency list to represent the graph
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Populate the adjacency list
        for (int[] road : roads) {
            int city1 = road[0];
            int city2 = road[1];
            adjList.get(city1).add(city2);
            adjList.get(city2).add(city1);
        }

        // Calculate distances between all pairs of cities
        int[][] distances = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            bfs(i, adjList, distances[i]);
        }

        int count = 0;

        // Iterate through all pairs of cities
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                List<Integer> commonNeighbors = new ArrayList<>();

                // Find common neighbors based on distances
                for (int k = 1; k <= n; k++) {
                    if (k != i && k != j && distances[i][k] == distances[j][k]) {
                        commonNeighbors.add(k);
                    }
                }

                // Count combinations of 3 hotels with equal distances
                int numCommon = commonNeighbors.size();
                count += numCommon * (numCommon - 1) / 2;
            }
        }

        return count;
    }

    private static void bfs(int start, List<List<Integer>> adjList, int[] distances) {
        Arrays.fill(distances, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        distances[start] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : adjList.get(current)) {
                if (distances[neighbor] == -1) {
                    distances[neighbor] = distances[current] + 1;
                    queue.offer(neighbor);
                }
            }
        }
    }
}
