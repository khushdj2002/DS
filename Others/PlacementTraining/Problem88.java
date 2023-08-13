package Others.PlacementTraining;

public class Problem88 {
        static int change(int amount, int[] coins) {
            int arr[] = new int[amount+1];
            arr[0] = 1;
            for(int c : coins)
                for(int i = c; i <= amount; i++)
                    arr[i] += arr[i-c];
            return arr[amount];
        }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 5;
        System.out.println(change(amount,coins));
    }
}
