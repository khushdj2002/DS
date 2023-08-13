package Others.PlacementTraining;

public class Problem81 {
    public static void main(String[] args) {
        int[] gas = {2,3,4};
        int[] cost ={3,4,3};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    static public int canCompleteCircuit(int[] gas, int[] cost) {

            for(int i=0;i<gas.length;i++){
                if(check(gas,cost,i)){
                    return i;
                }
            }
            return -1;
        }
        static boolean check(int[] gas,int[] cost,int i){
            int sum=0;
            for(int j=i;j<i+gas.length;j++){
                sum=sum+gas[j% gas.length];
                sum=sum-cost[j% gas.length];
                if(sum<0){
                    return false;
                }
            }
            return true;
        }
}
