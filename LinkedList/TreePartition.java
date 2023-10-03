package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class TreePartition {
    public static void main(String[] args) {
        int[] parent = {-1, 0,  1,  2};
        int[] files_size = {1, 4,3,4};

        int result = partitionTree(parent, files_size);
        System.out.println("Minimum difference in subtree sizes: " + result);
    }

    public static int partitionTree(int[] parent, int[] files_size) {
        int n = parent.length;
        int totalSize = 0;
        for (int size : files_size) {
            totalSize += size;
        }

        int[] subtreeSize = new int[n];
        List<List<Integer>> tree = new ArrayList<>();

        // Initialize the tree data structure
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }

        // Build the tree
        for (int i = 0; i < n; i++) {
            if (parent[i] != -1) {
                tree.get(parent[i]).add(i);
            }
        }

        // Calculate the size of each subtree using DFS
        dfs(0, tree, files_size, subtreeSize);

        int minDifference = Integer.MAX_VALUE;

        // Find the minimum difference between subtree sizes
        for (int i = 0; i < n; i++) {
            int subtree1Size = subtreeSize[i];
            int subtree2Size = totalSize - subtree1Size;
            int difference = Math.abs(subtree1Size - subtree2Size);
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }

    private static void dfs(int node, List<List<Integer>> tree, int[] files_size, int[] subtreeSize) {
        subtreeSize[node] = files_size[node];

        for (int child : tree.get(node)) {
            dfs(child, tree, files_size, subtreeSize);
            subtreeSize[node] += subtreeSize[child];
        }
    }
}