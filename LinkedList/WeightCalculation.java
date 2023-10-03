package LinkedList;

import java.util.*;

public class WeightCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int graphNodes = 8;
        int graph_edge = 4;
        List<Integer> graphFrom = new ArrayList<>();
        for (int i = 0; i < graph_edge; i++) {
            graphFrom.add(sc.nextInt());
        }
        List<Integer> graphTo = new ArrayList<>();
        for (int i = 0; i < graph_edge; i++) {
            graphTo.add(sc.nextInt());
        }
//        int[] graphFrom = {8,5,7,8};

//        int[] graphTo = {1,8,3,6};

        List<Set<Integer>> isolatedSets = new ArrayList<>();
        boolean[] visited = new boolean[graphNodes + 1];

        // Create an adjacency list to represent the graph
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= graphNodes; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < graphFrom.size(); i++) {
            int from = graphFrom.get(i);
            int to = graphTo.get(i);
            adjList.get(from).add(to);
            adjList.get(to).add(from);
        }

        // DFS to find isolated sets of nodes
        for (int node = 1; node <= graphNodes; node++) {
            if (!visited[node]) {
                Set<Integer> isolatedSet = new HashSet<>();
                dfs(node, adjList, visited, isolatedSet);
                isolatedSets.add(isolatedSet);
            }
        }

        int totalWeight = 0;

        // Calculate weight and sum the ceiling of the square root for each isolated set
        for (Set<Integer> isolatedSet : isolatedSets) {
            int weight = isolatedSet.size();
            int ceilingSquareRoot = (int) Math.ceil(Math.sqrt(weight));
            totalWeight += ceilingSquareRoot;
        }

        System.out.println("Total Weight: " + totalWeight);
    }

    private static void dfs(int node, List<List<Integer>> adjList, boolean[] visited, Set<Integer> isolatedSet) {
        visited[node] = true;
        isolatedSet.add(node);

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjList, visited, isolatedSet);
            }
        }
    }
}
