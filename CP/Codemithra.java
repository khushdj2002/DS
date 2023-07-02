package CP;

import java.util.Scanner;

public class Codemithra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of cylinders in each stack
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        // Read the heights of cylinders in each stack
        int[] h1 = new int[n1];
        int[] h2 = new int[n2];
        int[] h3 = new int[n3];

        for (int i = 0; i < n1; i++) {
            h1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            h2[i] = scanner.nextInt();
        }
        for (int i = 0; i < n3; i++) {
            h3[i] = scanner.nextInt();
        }

        // Calculate the initial heights of the stacks
        int height1 = calculateHeight(h1);
        int height2 = calculateHeight(h2);
        int height3 = calculateHeight(h3);

        // Find the maximum possible height of all stacks
        int maxHeight = findMaxHeight(height1, height2, height3, h1, h2, h3);

        // Print the result
        System.out.println(maxHeight);

        scanner.close();
    }

    private static int calculateHeight(int[] stack) {
        int height = 0;
        for (int cylinder : stack) {
            height += cylinder;
        }
        return height;
    }

    private static int findMaxHeight(int height1, int height2, int height3, int[] h1, int[] h2, int[] h3) {
        int index1 = 0, index2 = 0, index3 = 0;

        while (true) {
            // If any of the stacks is empty, return 0 (minimum height)
            if (index1 == h1.length || index2 == h2.length || index3 == h3.length) {
                return 0;
            }

            // If all stacks have the same height, return the height
            if (height1 == height2 && height2 == height3) {
                return height1;
            }

            // Find the stack with the maximum height
            if (height1 >= height2 && height1 >= height3) {
                height1 -= h1[index1++];
            } else if (height2 >= height1 && height2 >= height3) {
                height2 -= h2[index2++];
            } else {
                height3 -= h3[index3++];
            }
        }
    }
}
