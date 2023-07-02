import java.util.Collections;
import java.util.LinkedList;

public class SumOfImbalanceNumbersOfAllSubarrays {
    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 3, 5};
        System.out.println(sumImbalanceNumbers(arr));
    }

    static int sumImbalanceNumbers(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            LinkedList<Integer> list = new LinkedList<>();
            list.add(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                list.add(nums[j]);
                Collections.sort(list);
                for (int k = list.size() - 1; k > 0; k--) {
                    if (list.get(k) - list.get(k - 1) > 1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}