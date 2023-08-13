package Others.PlacementTraining;

import java.util.Scanner;

public class Problem80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        System.out.println(longestOnes(arr,k));
    }
    static public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=0;
        int count=0;
        while(j<nums.length&&i<nums.length-1){
            if(count>=k){
                if(nums[j]==1){
                    j++;
                }
                else{
                    if(nums[i]==0){
                        count--;
                    }
                    i++;
                    continue;
                }
            }
            else{
                if(nums[j]==1){
                    j++;
                }
                else{
                    count++;
                    j++;
                }
            }
            if((j-i+1)>max){
                max=j-i;
            }
        }
        return max;
    }
}
