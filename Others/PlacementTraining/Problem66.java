package Others.PlacementTraining;

import java.util.Scanner;

public class Problem66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(PredictTheWinner(arr));
    }
       static public boolean PredictTheWinner(int[] nums) {
            int player1=0;
            int player2=0;
            int j=nums.length-1;
            int check=1;
            int res=0;
            int x=0;
            int y=0;
            int z=0;
            for(int i=0;i<nums.length;i++){
                if(j-i>3){
                    int a = nums[i];
                    int b = nums[j];
                    int c = nums[i+1];
                    int d = nums[j-1];
                    if(a>b&&a>c&&a>d){
                        res=a;
                    }
                    else if(b>a&&b>c&&b>d){
                        res=b;
                        i--;
                        j--;
                    }
                    else if(c>d&&c>a&&c>b){
                        res=b;
                        i--;
                        j--;
                    }
                    else if(d>a&&d>b&&d>c){
                        res=a;
                    }
                    if(check%2==0){
                        player2+=res;
                    }
                    else{
                        player1+=res;
                    }
                }
                else{
                    if(nums[i]>nums[j]){
                        x = nums[i];
                        i++;
                        if(nums[i]>nums[j]){
                            y=nums[i];
                            z=nums[j];
                        }
                        else{
                            y = nums[j];
                            z = nums[i];
                        }
                    }
                    else{
                        x = nums[j];
                        j--;
                        if(nums[i]>nums[j]){
                            y = nums[i];
                            z =nums[j];
                        }
                        else{
                            y = nums[j];
                            z = nums[i];
                        }
                    }
                    if(check%2==0){
                        player2=player2+x+z;
                        player1 = player1+y;
                    }
                    else{
                        player1=player1+x+z;
                        player2=player2+y;
                    }
                    break;
                }

                check++;
            }
            System.out.println(player1+" "+player2);
            return true;
        }
}
