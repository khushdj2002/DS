package Others.TUF.DP;

import java.util.Scanner;

public class EqualizeChocolates {
    public static int minOperations(int[] chocolates, int target) {
        int operations = 0;
        for (int i = 0; i < chocolates.length; i++) {
            int diff = chocolates[i]-target;
            operations = operations+(diff/5);
            diff = diff%5;
            operations = operations+(diff/2);
            diff = diff%2;
            operations=operations+diff;
        }
        return operations;
    }

    public static int equal(int[] arr) {
        int minChocolates = Integer.MAX_VALUE;

        // Find the minimum number of chocolates held by any colleague
        for (int choco : arr) {
            minChocolates = Math.min(minChocolates, choco);
        }

        int minOperations = Integer.MAX_VALUE;

        // Iterate through all possible target numbers
        for (int target = minChocolates; target >= 0; target--) {
            int operations = minOperations(arr, target);
            minOperations = Math.min(minOperations, operations);
        }

        return minOperations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int result = equal(arr);
            System.out.println(result);
        }

        scanner.close();
    }
}
