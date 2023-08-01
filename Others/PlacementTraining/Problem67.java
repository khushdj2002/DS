package Others.PlacementTraining;

import java.util.Scanner;

public class Problem67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] arr = {10,17,11,16,17,9,14,17,18,13,11,4,17,18,15,3,13,10};
//        for (int i = 0; i < n; i++) {
//            arr[i]= sc.nextInt();
//        }
        System.out.println(PredictTheWinner(arr));
    }
    static public boolean PredictTheWinner(int[] nums) {
        int player1=0;
        int player2=0;
        int j = nums.length-1;
        int res=0;
        int check=1;
        for (int i = 0; i < nums.length; i++) {
            if (j-i>2){
                int a = nums[i];
                int b = nums[j];
                int c = nums[i+1];
                int d = nums[j-1];
                if((a>=b&&a>=c&&a>=d)||(d>=a&&d>=b&&d>=c)){
                    res=a;
                }
                else{
                    res=b;
                    i--;
                    j--;
                }
            }
            else{
                if(j-i>=1){
                    if (nums[i]>nums[j]){
                        res=nums[i];
                    }
                    else {
                        res=nums[j];
                        i--;
                        j--;
                    }
                } else {
                    if(check%2==0){
                        player2+=nums[i];
                    }
                    else{
                        player1+=nums[i];
                    }
                    break;
                }
            }
            if(check%2==0){
                player2+=res;
            }
            else{
                player1+=res;
            }
            check++;
        }
        if (player1>player2){
            return true;
        }
        return false;
    }
}
