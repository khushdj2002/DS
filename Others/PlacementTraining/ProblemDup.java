package Others.PlacementTraining;

public class ProblemDup {
    static int min_moves(int n)
    {
        // To store the required answer
        int ans = Integer.MAX_VALUE;

        // For all possible values of divisors
        for (int i = 1; i * i <= n; i++)
        {

            // If i is a divisor of n
            if (n % i == 0)
            {

                // Get the moves to reach n
                ans = Math.min(ans, i + n / i - 2);
            }
        }

        // Return the required answer
        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 10;

        System.out.println(min_moves(n));
    }
}
