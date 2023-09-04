package Others;

import java.util.*;

import java.util.*;

public class DominoColoring {
    static final int MOD = 1000000007;

    public static int countColorings(String[] domino) {
        int n = domino.length;
        int[][] dp = new int[n + 1][3]; // dp[i][j] represents the number of ways to color dominoes up to index i with last color j

        dp[0][0] = dp[0][1] = dp[0][2] = 1;

        for (int i = 1; i <= n; i++) {
            if (domino[i - 1].charAt(0) == domino[i - 1].charAt(1)) {
                dp[i][0] = (dp[i - 1][1] + dp[i - 1][2]) % MOD;
                dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
                dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
            } else {
                dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % MOD;
                dp[i][1] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % MOD;
                dp[i][2] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % MOD;
                dp[i][domino[i - 1].charAt(0) - 'A'] = (dp[i][domino[i - 1].charAt(0) - 'A'] - dp[i - 1][domino[i - 1].charAt(0) - 'A'] + MOD) % MOD;
                dp[i][domino[i - 1].charAt(1) - 'A'] = (dp[i][domino[i - 1].charAt(1) - 'A'] - dp[i - 1][domino[i - 1].charAt(1) - 'A'] + MOD) % MOD;
            }
        }

        return (dp[n][0] + dp[n][1] + dp[n][2]) % MOD;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] domino = new String[n];
        for (int i = 0; i < n; i++) {
            domino[i] = scanner.next();
        }
        scanner.close();

        int result = countColorings(domino);
        System.out.println(result);
    }
}
