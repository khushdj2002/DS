package Others.TUF.DP;


 /*
         In this question a arobber can robb the house but can't rob adjjacent house
         it will alert the police and the houses are in circular manner so that
         the first and last home are adjacent to each other.
  */
public class HouseRobber {
     public static void main(String[] args) {
         int[] arr = {2,3,2};
         int first_left = collectFirst(arr);
         int last_left =  collectLast(arr);
         System.out.println(Math.max(first_left,last_left));
     }
     static int collectFirst(int[] arr){
         int[] dp = new int[arr.length-1];
         dp[0]=arr[1];
         for (int i = 2; i < arr.length ; i++) {
             int pick = arr[i];
             if(i>=3){
                 pick=pick+dp[i-3];
             }
             int not_pick = dp[i-2];
            dp[i-1] = Math.max(pick,not_pick);
         }
         return dp[dp.length-1];
     }
     static int collectLast(int[] arr){
         int[] dp = new int[arr.length-1];
         dp[0]=arr[0];
         for (int i = 1; i < arr.length-1 ; i++) {
             int pick = arr[i];
             if(i>=2){
                 pick=pick+dp[i-2];
             }
             int not_pick = dp[i-1];
             dp[i] = Math.max(pick,not_pick);
         }
         return dp[dp.length-1];
     }
}
