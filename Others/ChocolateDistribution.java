package Others;
import java.util.ArrayList;
import java.util.List;

public class ChocolateDistribution {
    static int count=0;
    public static void main(String[] args) {
        int numberOfChildren = 3;
        int totalChocolates = 2;  // Change this to the total number of chocolates you have
        int maxChocolatesPerChild = 2;  // Change this to the maximum chocolates to give to a child

        List<List<Integer>> distributions = new ArrayList<>();
        distributeChocolates(numberOfChildren, totalChocolates, maxChocolatesPerChild, new ArrayList<>(), distributions);

        // Print all distributions
        for (List<Integer> distribution : distributions) {
            System.out.println(distribution);
        }
        System.out.println(count);
    }

    private static void distributeChocolates(int remainingChildren, int remainingChocolates,
                                             int maxChocolatesPerChild, List<Integer> currentDistribution,
                                             List<List<Integer>> allDistributions) {
        if (remainingChildren == 0) {
            if (remainingChocolates == 0) {
                allDistributions.add(new ArrayList<>(currentDistribution));
                count++;
            }
            return;
        }

        for (int chocolatesGiven = 0; chocolatesGiven <= maxChocolatesPerChild; chocolatesGiven++) {
            if (chocolatesGiven <= remainingChocolates) {
                currentDistribution.add(chocolatesGiven);
                distributeChocolates(remainingChildren - 1, remainingChocolates - chocolatesGiven, maxChocolatesPerChild, currentDistribution, allDistributions);
                currentDistribution.remove(currentDistribution.size() - 1);
            }
        }
    }
}
