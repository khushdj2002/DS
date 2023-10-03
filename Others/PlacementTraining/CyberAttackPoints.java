package Others.PlacementTraining;

import java.util.ArrayList;
import java.util.List;

public class CyberAttackPoints {
    public static List<Integer> calculatePoints(int n, int[] layers, int[] energy, int k) {
        List<Integer> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int remainingEnergy = k;
            int currentPoints = 0;

            for (int j = i; j < n; j++) {
                if (remainingEnergy >= layers[j]) {
                    currentPoints++;
                    remainingEnergy -= layers[j];
                } else {
                    break; // Stop the attack if there's not enough energy
                }

                // Award an additional point if there's enough energy for at least 1 layer
                if (remainingEnergy >= 1) {
                    currentPoints++;
                    remainingEnergy--;
                }
            }

            points.add(currentPoints);
        }

        return points;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] layers = {2,2,5};
        int[] energy = {2,3,1};
        int k = 5;

        List<Integer> result = calculatePoints(n, layers, energy, k);
        System.out.println(result); // Output: [1, 2, 1]
    }
}
