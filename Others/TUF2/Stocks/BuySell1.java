package Others.TUF2.Stocks;

public class BuySell1 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int min  = arr[0];
        int res=0;
        for (int i =1; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
            else {
                if(res<arr[i]-min){
                    res = arr[i]-min;
                }
            }
        }
        System.out.println(res);
    }
}
